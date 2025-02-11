
package permanencia.sqlite;

import bancodedados.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Pastor;
import org.sqlite.SQLiteErrorCode;
import permanencia.interfaces.PastorDAOI;
import java.sql.Connection;
import java.sql.ResultSet;

public class PastorDAO implements PastorDAOI {
    Connection conexao;
    public PastorDAO() {
        conexao = BancoDeDados.getInstance().getConnection();
    }
    
    
    @Override
    public boolean criar(Pastor pastor) {
        int resultado = 0;
        try (PreparedStatement comando = conexao.prepareStatement(
          """
                    INSERT INTO pastor(nome, nis, salario, email) VALUES(?, ?, ?, ?);
                """)) {
            comando.setString(1, pastor.getNome());
            comando.setString(2, pastor.getNis());
            comando.setDouble(3, pastor.getSalario());
            comando.setString(4, pastor.getEmail());
            
            
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
    public Pastor buscarPorNis(String nisBusca) {
        String nome, nis, email;
        double salario;
        
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from pastor where nis = ?")) {
        comando.setString(1, nisBusca);
        ResultSet res  = comando.executeQuery();
        if (res.next()){
            nis = res.getString("nis");
            nome = res.getString("nome");
            salario = res.getDouble("salario");
            email = res.getString("email");
            return new Pastor(nis, nome, email, salario);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
