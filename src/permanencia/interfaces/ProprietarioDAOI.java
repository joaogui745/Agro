package permanencia.interfaces;
import modelos.Proprietario;
import java.sql.SQLException;

public interface ProprietarioDAOI {
    public Proprietario buscarPorEmail(String email);
    public String criar(Proprietario proprietario);
    public boolean apagar(String email);
    public boolean atualizar(Proprietario proprietario, String emailBusca);
}
