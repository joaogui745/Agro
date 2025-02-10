package permanencia.interfaces;

import modelos.Local;

public interface LocalDAOI {
    public Local buscarPorChave(String nome, int idFazenda);
    public boolean criar(Local local);
    public boolean apagar(String nome, int idFazenda);
    public boolean atualizar(Local local, String nome, int idFazenda);
}
