package permanencia.sqlite;
import java.sql.Connection;
import bancodedados.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Fazenda;
import modelos.Imagem;
import modelos.Local;
import modelos.Pastor;
import modelos.Proprietario;
import org.sqlite.SQLiteErrorCode;
import permanencia.interfaces.ProprietarioDAOI;
public class ProprietarioDAO implements ProprietarioDAOI{
    private final Connection conexao;
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
    public boolean criar(Proprietario proprietario){
        boolean resultado = true;
        try (PreparedStatement comando = conexao.prepareStatement(
                "INSERT INTO proprietario(email, cpf, senha, nome, telefone) VALUES(?, ?, ?, ?, ?);")) {
            comando.setString(1, proprietario.getEmail());
            comando.setString(2, proprietario.getCpf());
            comando.setString(3, proprietario.getSenha());
            comando.setString(4, proprietario.getNome());
            comando.setString(5, proprietario.getTelefone());
            
            comando.executeUpdate();
            
        } catch (SQLException ex) {
            if(SQLiteErrorCode.SQLITE_CONSTRAINT.code == ex.getErrorCode()){
                return false;
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

    @Override
    public ArrayList<Fazenda> buscarFazendas(String emailProprietario) {
        int idFazenda;
        double areaTotal;
        String estado, nome, email;
        ArrayList<Fazenda> lista = new ArrayList<>();
        
        try (PreparedStatement comando = conexao.prepareStatement(
                "SELECT * FROM fazenda WHERE email = ?")) {
        comando.setString(1, emailProprietario);
        ResultSet res  = comando.executeQuery();
        while (res.next()){
            idFazenda = res.getInt("idFazenda");
            areaTotal = res.getDouble("areaTotal");
            estado = res.getString("estado");
            nome = res.getString("nome");
            email = res.getString("nome");
            lista.add(new Fazenda(idFazenda, areaTotal, estado, nome, email));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return lista;
    }

    @Override
    public ArrayList<Local> buscarLocais(String emailProprietario) {
        ArrayList<Local> locais = new ArrayList<>();
        String nome, nisPastor;
        int idFazenda;
        double area;
        byte[] foto;
        try (PreparedStatement comando = conexao.prepareStatement(
                """
                SELECT *
                FROM LocalidadesPorProprietario
                WHERE email = ?;
                """)) {
        comando.setString(1, emailProprietario);
        ResultSet res  = comando.executeQuery();
        while (res.next()){
            nome = res.getString("nome");
            nisPastor = res.getString("nisPastor");
            idFazenda = res.getInt("idFazenda");
            area = res.getDouble("area");
            foto = res.getBytes("foto");
            locais.add(new Local(nome, nisPastor, idFazenda, area, new Imagem(foto)));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return locais;
    }

    @Override
    public ArrayList<Pastor> buscarPastores(String emailProprietario) {
        ArrayList<Pastor> locais = new ArrayList<>();
        String nis, nome, email;
        double salario;
        try (PreparedStatement comando = conexao.prepareStatement(
                """
                SELECT * from pastor
                WHERE email = ?;
                """)) {
        comando.setString(1, emailProprietario);
        ResultSet res  = comando.executeQuery();
        while (res.next()){
            nome = res.getString("nome");
            nis = res.getString("nis");
            email = res.getString("email");
            salario = res.getDouble("salario");
            locais.add(new Pastor(nis, nome, email ,salario));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return locais;
    }
    
    
    
}
