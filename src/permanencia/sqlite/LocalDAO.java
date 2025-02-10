package permanencia.sqlite;

import bancodedados.BancoDeDados;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Fazenda;
import modelos.Local;
import permanencia.interfaces.LocalDAOI;
import java.sql.Connection;
import modelos.Imagem;
import org.sqlite.SQLiteErrorCode;


public class LocalDAO implements LocalDAOI{
    Connection conexao;
    
    public LocalDAO() {
        conexao = BancoDeDados.getInstance().getConnection();
    }
    
    
    
    @Override
    public Local buscarPorChave(String nomeBusca, int idFazendaBusca) {
        String nome, nisPastor;
        int idFazenda;
        double area;
        byte[] foto;
        
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from localidade where nome = ? and idFazenda = ?")) {
        comando.setString(1, nomeBusca);
        comando.setInt(2, idFazendaBusca);
        ResultSet res  = comando.executeQuery();
        if (res.next()){
            idFazenda = res.getInt("idFazenda");
            nome = res.getString("nome");
            nisPastor = res.getString("nisPastor");
            area = res.getDouble("area");
            foto = res.getBytes("foto");
            return new Local(nome, nisPastor, idFazenda, area, new Imagem(foto));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    @Override
    public boolean criar(Local local) {
        /*String nome, nisPastor;
        int idFazenda;
        double area;
        InputStream foto;*/
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
          """
                    INSERT INTO localidade(nome, nisPastor, idFazenda, area, foto) VALUES(?, ?, ?, ?, ?);
                """)) {
            comando.setString(1, local.getNome());
            comando.setString(2, local.getNisPastor());
            comando.setInt(3, local.getIdFazenda());
            comando.setDouble(4, local.getArea());
            comando.setBytes(5, local.getFoto().getBinary());
            
            resultado = comando.executeUpdate();
        } catch (SQLException ex) {
            if(SQLiteErrorCode.SQLITE_CONSTRAINT.code == ex.getErrorCode()){
                return false;
            }
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado != 0;
    }

    @Override
    public boolean apagar(String nome, int idFazenda) {
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
                    "DELETE FROM localidade WHERE nome = ? and idFazenda = ?;")) {
            
            comando.setString(1, nome);
            comando.setInt(2, idFazenda);
            resultado  = comando.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1 == resultado;
    }

    @Override
    public boolean atualizar(Local local, String nome, int idFazenda) {
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
  """
              UPDATE localidade
              SET nome = ?, nisPastor = ?,
              idFazenda = ?, area = ?, foto = ?
              WHERE nome = ? and idFazenda = ?; 
        """)) {
            comando.setString(1, local.getNome());
            comando.setString(2, local.getNisPastor());
            comando.setInt(3, local.getIdFazenda());
            comando.setDouble(4, local.getArea());
            comando.setBytes(5, local.getFoto().getBinary());
            comando.setString(6, nome);
            comando.setInt(7, idFazenda);
            resultado  = comando.executeUpdate();
        } catch (SQLException ex) {
            if(SQLiteErrorCode.SQLITE_CONSTRAINT.code == ex.getErrorCode()){
                return false;
            }
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado == 1;
    }
    
}
