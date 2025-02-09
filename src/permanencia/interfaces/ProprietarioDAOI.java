package permanencia.interfaces;
import modelos.Fazenda;
import modelos.Proprietario;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProprietarioDAOI {
    public Proprietario buscarPorEmail(String email);
    public boolean criar(Proprietario proprietario);
    public boolean apagar(String email);
    public boolean atualizar(Proprietario proprietario, String emailBusca);
    ArrayList<Fazenda> buscarFazendas(String emailProprietario);
}
