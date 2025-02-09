package permanencia.sqlite;

import bancodedados.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Fazenda;
import java.sql.Connection;
import org.sqlite.SQLiteErrorCode;
import permanencia.interfaces.FazendaDAOI;

public class FazendaDAO implements FazendaDAOI {
    private final Connection conexao;

    public FazendaDAO() {
        conexao = BancoDeDados.getInstance().getConnection();
    }
    
    @Override
    public Fazenda buscarPorId(int idFazendaBusca) {
        int idFazenda;
        double areaTotal;
        String estado, nome, email;
        
    try (PreparedStatement comando = conexao.prepareStatement(
                "select * from fazenda where idFazenda = ?")) {
        comando.setInt(1, idFazendaBusca);
        ResultSet res  = comando.executeQuery();
        
        if (res.next()){
            idFazenda = res.getInt("idFazenda");
            areaTotal = res.getDouble("areaTotal");
            estado = res.getString("estado");
            nome = res.getString("nome");
            email = res.getString("email");
            return new Fazenda(idFazenda, areaTotal, estado, nome, email);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean criar(Fazenda fazenda) {
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
          """
                    INSERT INTO fazenda(areaTotal, estado, nome, email) VALUES(?, ?, ?, ?)
                    RETURNING idFazenda;
                """)) {
            comando.setDouble(1, fazenda.getAreaTotal());
            comando.setString(2, fazenda.getEstado());
            comando.setString(3, fazenda.getNome());
            comando.setString(4, fazenda.getEmail());
            
            ResultSet querry = comando.executeQuery();
            resultado = querry.getInt("idFazenda");
            if (resultado != 0){
                fazenda.setIdFazenda(resultado);
            }
            
            
        } catch (SQLException ex) {
            if(SQLiteErrorCode.SQLITE_CONSTRAINT.code == ex.getErrorCode()){
                return false;
            }
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado != 0;
    }

    @Override
    public boolean apagar(int idFazenda) {
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
                    "DELETE FROM fazenda WHERE idFazenda = ?;")) {
            comando.setInt(1, idFazenda);
            resultado  = comando.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1 == resultado;
    }

    @Override
    public boolean atualizar(Fazenda fazenda, int idFazenda) {
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
  """
              UPDATE fazenda
              SET areaTotal = ?, estado = ?,
              nome = ?, email = ?
              WHERE idFazenda = ?; 
        """)) {
            comando.setDouble(1, fazenda.getAreaTotal());
            comando.setString(2, fazenda.getEstado());
            comando.setString(3, fazenda.getNome());
            comando.setString(4, fazenda.getEmail());
            comando.setInt(5, idFazenda);
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
