package permanencia.interfaces;
import modelos.Proprietario;

public interface ProprietarioDAOI {
    public Proprietario buscarPorEmail(String email);
    public int criar(Proprietario proprietario);
    public boolean apagar(int idProprietario);
    public boolean atualizar(Proprietario proprietario, int idProprietario);
}
