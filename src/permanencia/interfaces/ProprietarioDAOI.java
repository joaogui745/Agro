package permanencia.interfaces;
import modelos.Fazenda;
import modelos.Proprietario;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Local;
import modelos.Pastor;

public interface ProprietarioDAOI {
    public Proprietario buscarPorEmail(String email);
    public boolean criar(Proprietario proprietario);
    public boolean apagar(String email);
    public boolean atualizar(Proprietario proprietario, String emailBusca);
    ArrayList<Fazenda> buscarFazendas(String emailProprietario);
    ArrayList<Local> buscarLocais(String emailProprietario);
    ArrayList<Pastor> buscarPastores(String emailProprietario);
}
