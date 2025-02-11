package permanencia.sqlite;

import modelos.Pastor;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PastorDAOTest {
    private static PastorDAO conexao;
    public PastorDAOTest() {
    }
    
    @BeforeClass
    public static void iniciaconexao() {
        conexao = new PastorDAO();
    }

    @Test
    public void testCriarBuscar() {
        Pastor pastor = new Pastor("12349678901", "João Silva","joao@unb.br" ,5000.00 );
        boolean resposta = conexao.criar(pastor);
        assertTrue(resposta);
        Pastor mesmoPastor = conexao.buscarPorNis(pastor.getNis());
        assertEquals(pastor.tooString(), mesmoPastor.tooString());
        Pastor outroPastor = conexao.buscarPorNis("");   // Id Inexistente
        assertNull(outroPastor);
    }
    
}
