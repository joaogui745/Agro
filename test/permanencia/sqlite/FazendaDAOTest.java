package permanencia.sqlite;

import modelos.Fazenda;
import modelos.Proprietario;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FazendaDAOTest {
    private static FazendaDAO conexao;
    public FazendaDAOTest() {
    }
    
    @BeforeClass
    public static void iniciaConexao() {
        conexao = new FazendaDAO();
    }

    @Test
    public void testCriarBuscar() {
        Fazenda fazenda = new Fazenda(100.0, "Goiás", "Fazenda Boi Branco", "boi.branco@unb.br");
        boolean resposta = conexao.criar(fazenda);
        assertTrue(resposta);
        Fazenda mesmaFazenda = conexao.buscarPorId(fazenda.getIdFazenda());
        assertEquals(fazenda.toString(), mesmaFazenda.toString());
        Fazenda outraFazenda = conexao.buscarPorId(7777);   // Id Inexistente
        assertNull(outraFazenda);
    }



    @Test
    public void testApagar() {
        Fazenda fazenda =  new Fazenda(500.0, "Minas Gerais", "Fazenda Serra da Mantiqueira", "serra.mantiqueira@unb.br");
        conexao.apagar(fazenda.getIdFazenda());
        Fazenda mesmaFazenda = conexao.buscarPorId(fazenda.getIdFazenda());
        assertNull(mesmaFazenda);
    }

    @Test
    public void testAtualizar() {
        boolean resposta;
        
        // Mudando atributos complementares
        Fazenda fazenda =  new Fazenda(200.0, "Mato Grosso", "Fazenda Chapadão", "chapadao@unb.br");
        boolean resultado = conexao.criar(fazenda);
        assertTrue(resultado);
        fazenda.setAreaTotal(110.8);
        fazenda.setEstado("SP");
        fazenda.setNome("Fazenda Alves");
        fazenda.setEmail("valves@unb.br");
        resposta = conexao.atualizar(fazenda, fazenda.getIdFazenda());
        assertTrue(resposta);
        Fazenda fazendaAtualizada = conexao.buscarPorId(fazenda.getIdFazenda());
        assertEquals( fazenda.toString(), fazendaAtualizada.toString());
        
        // Mudando objeto inexistente
        resposta = conexao.atualizar(fazenda, 7777);
        assertFalse(resposta);
    }
    
}
