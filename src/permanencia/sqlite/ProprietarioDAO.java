package permanencia.sqlite;
import java.sql.Connection;
import bancodedados.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Proprietario;
import permanencia.interfaces.ProprietarioDAOI;
public class ProprietarioDAO implements ProprietarioDAOI{
    Connection conexao;
    public ProprietarioDAO() {
        conexao = BancoDeDados.getInstance().getConnection();
    }

    @Override
    public Proprietario buscarPorEmail(String emailBusca) {
        String cpf, email, senha, nome, telefone;
        try (PreparedStatement comando = conexao.prepareStatement(
                "select * from avaliacao where email = ?")) {
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
        } 
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public int criar(Proprietario proprietario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean apagar(int idProprietario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizar(Proprietario proprietario, int idProprietario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
