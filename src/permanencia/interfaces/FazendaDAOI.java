package permanencia.interfaces;

import modelos.Fazenda;

public interface FazendaDAOI {
    public Fazenda buscarPorId(int idFazenda);
    public boolean criar(Fazenda fazenda);
    public boolean apagar(int  idFazenda);
    public boolean atualizar(Fazenda fazenda, int idFazenda);
}
