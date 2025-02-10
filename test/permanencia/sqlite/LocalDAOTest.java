package permanencia.sqlite;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import modelos.Imagem;
import modelos.Local;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocalDAOTest {
    private static LocalDAO conexao;
    public LocalDAOTest() {
    }
    
    @BeforeClass
    public static void iniciaConexao() {
        conexao = new LocalDAO();
    }

    @Test
    public void testCriarBuscar() {
        File arquivo = new File("test/permanencia/imagens/chat.png");
        assertNotNull(arquivo);
        Local local = new Local("Pasto do Sol", "12345678901", 1, 100.5, new Imagem(arquivo));
        boolean resposta = conexao.criar(local);
        assertTrue(resposta);
        Local mesmoLocal = conexao.buscarPorChave(local.getNome(), local.getIdFazenda());
        assertEquals(local.toString(), mesmoLocal.toString());
        assertTrue(Arrays.equals(local.getFoto().getBinary(), mesmoLocal.getFoto().getBinary()));
        Local outroLocal = conexao.buscarPorChave("Matagal", 0);   // Id Inexistente
        assertNull(outroLocal);
    }


    @Test
    public void testApagar() {
        File arquivo = new File("test/permanencia/imagens/king.png");
        assertNotNull(arquivo);
        Local local = new Local("Campo Verde", "98765432109", 2, 50.2, new Imagem(arquivo));
        conexao.apagar(local.getNome(), local.getIdFazenda());
        Local mesmaFazenda = conexao.buscarPorChave(local.getNome(), local.getIdFazenda());
        assertNull(mesmaFazenda);
    }

    
    @Test
    public void testAtualizar() {
        boolean resposta;
        
        // Mudando atributos complementares
        File arquivo = new File("test/permanencia/imagens/king.png");
        assertNotNull(arquivo);
        Local local = new Local("Fazenda Santa Maria", "56789012345", 3, 200.7, new Imagem(arquivo));
        conexao.criar(local);
        local.setNisPastor("99988877766");
        local.setArea(450.6);
        File outroArquivo = new File("test/permanencia/imagens/money.png");
        assertNotNull(outroArquivo);
        local.setFoto(new Imagem(outroArquivo));
        resposta = conexao.atualizar(local, local.getNome(), local.getIdFazenda());
        assertTrue(resposta);
        Local localAtualizado = conexao.buscarPorChave(local.getNome(), local.getIdFazenda());
        assertEquals( local.toString(), localAtualizado.toString());
        assertTrue(Arrays.equals(local.getFoto().getBinary(), localAtualizado.getFoto().getBinary()));
        
        // Mudando objeto inexistente
        resposta = conexao.atualizar(local, "Pato Donal", 999);
        assertFalse(resposta);
        
        // Mudando chave primaria
        local = new Local("Sítio do Vale", "24680135790", 1, 75.3, new Imagem(arquivo));
        resposta = conexao.criar(local);
        assertTrue(resposta);
        String nomeAntigo = local.getNome();
        int idFazendaAntigo = local.getIdFazenda();
        local.setNome("Matagal do Sul");
        local.setIdFazenda(2);
        resposta = conexao.atualizar(local, nomeAntigo, idFazendaAntigo);
        assertTrue(resposta);
        localAtualizado = conexao.buscarPorChave(local.getNome(), local.getIdFazenda());
        assertEquals(localAtualizado.toString(), local.toString());
        assertTrue(Arrays.equals(local.getFoto().getBinary(), localAtualizado.getFoto().getBinary()));
    }
    
}
