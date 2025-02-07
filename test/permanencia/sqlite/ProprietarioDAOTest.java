package permanencia.sqlite;

import modelos.Proprietario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class ProprietarioDAOTest {
    private static ProprietarioDAO conexao;
    @BeforeClass
    public static void iniciaConexao(){
        conexao = new ProprietarioDAO();
    }
    
    
    
    @Test
    public void testCriarBuscar() {
        Proprietario proprietario = new Proprietario("987.654.321-09", "maria.silva@unb.br", "senha123", "Maria Silva", "9999-8888");
        boolean resposta = conexao.criar(proprietario);
        assertTrue(resposta);
        Proprietario mesmoProprietario = conexao.buscarPorEmail(proprietario.getEmail());
        assertEquals(proprietario.toString(), mesmoProprietario.toString());
        Proprietario outroProprietario = conexao.buscarPorEmail("null@unb.com"); // Email Inexistente
        assertNull(outroProprietario);
    }
    
   
    @Test
    public void testApagar() {
        Proprietario proprietario = new Proprietario("123.456.789-01", "carlos.pereira@unb.br", "senhasegura", "Carlos Pereira", "8888-7777");
        conexao.apagar(proprietario.getEmail());
        Proprietario mesmoProprietario = conexao.buscarPorEmail(proprietario.getEmail());
        assertNull(mesmoProprietario);
    }

    @Test
    public void testAtualizar() {
        boolean resposta;
        
        // Mudando atributos complementares
        Proprietario proprietario = new Proprietario("555.444.333-22", "ana.souza@unb.br", "minhasenha", "Ana Souza", "7777-6666");
        conexao.criar(proprietario);
        proprietario.setCpf("999.888.777-66");
        proprietario.setSenha("senhaforte");
        proprietario.setNome("Ana Souza Alves");
        proprietario.setTelefone("5555-4444");
        resposta = conexao.atualizar(proprietario, proprietario.getEmail());
        assertTrue(resposta);
        Proprietario proprietarioAtualizado = conexao.buscarPorEmail(proprietario.getEmail());
        assertEquals( proprietario.toString(), proprietarioAtualizado.toString());
        
        // Mudando objeto inexistente
        resposta = conexao.atualizar(proprietario, "null@unb.br");
        assertFalse(resposta);
        
        // Mudando chave primaria
        proprietario = new Proprietario("111.222.333-44", "pedro.gomes@unb.br", "password123", "Pedro Gomes", "6666-5555");
        conexao.criar(proprietario);
        String emailAntigo = proprietario.getEmail();
        proprietario.setEmail("pedrao@unb.br");
        resposta = conexao.atualizar(proprietario, emailAntigo);
        assertTrue(resposta);
        proprietarioAtualizado = conexao.buscarPorEmail(proprietario.getEmail());
        assertEquals(proprietarioAtualizado.toString(), proprietario.toString());
    }
    
}
