package permanencia.sqlite;
import java.sql.Connection;
import bancodedados.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Proprietario;
import org.sqlite.SQLiteErrorCode;
import permanencia.interfaces.ProprietarioDAOI;
public class ProprietarioDAO implements ProprietarioDAOI{
    Connection conexao;
    public ProprietarioDAO() {
        conexao = BancoDeDados.getInstance().getConnection();
    }

    @Override
    public Proprietario buscarPorEmail(String emailBusca){
        String cpf, email, senha, nome, telefone;
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from proprietario where email = ?")) {
        comando.setString(1, emailBusca);
        ResultSet res  = comando.executeQuery();
        
        if (res.next()){
            cpf = res.getString("cpf");
            email = res.getString("email");
            senha = res.getString("senha");
            nome = res.getString("nome");
            telefone = res.getString("telefone");
            return new Proprietario(cpf, email, senha, nome, telefone);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String criar(Proprietario proprietario){
        String resultado = "";
        try (PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO proprietario(email, cpf, senha, nome, telefone) VALUES(?, ?, ?, ?, ?)"
                        + "RETURNING email;")) {
            comando.setString(1, proprietario.getEmail());
            comando.setString(2, proprietario.getCpf());
            comando.setString(3, proprietario.getSenha());
            comando.setString(4, proprietario.getNome());
            comando.setString(5, proprietario.getTelefone());
            
            ResultSet id = comando.executeQuery();
            resultado = id.getString("email");
            
        } catch (SQLException ex) {
            if(SQLiteErrorCode.SQLITE_CONSTRAINT.code == ex.getErrorCode()){
                return resultado;
            }
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    @Override
    public boolean apagar(String emailBusca){
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
                    "DELETE FROM proprietario WHERE email = ?;")) {
            comando.setString(1, emailBusca);
            resultado  = comando.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1 == resultado;
    }

    @Override
    public boolean atualizar(Proprietario proprietario, String emailBusca){
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
  """
              UPDATE proprietario
              SET email = ?, cpf = ?,
              senha = ? , nome = ?, telefone = ?
              WHERE email = ?; 
        """)) {
            comando.setString(1, proprietario.getEmail());
            comando.setString(2, proprietario.getCpf());
            comando.setString(3, proprietario.getSenha());
            comando.setString(4, proprietario.getNome());
            comando.setString(5, proprietario.getTelefone());
            comando.setString(6, emailBusca);
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
