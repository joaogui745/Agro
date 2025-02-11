package bancodedados;


import org.junit.Test;


public class BancoDeDadosTest {
    
    public BancoDeDadosTest() {
    }

    @Test
    public void testGetConnection() {
        BancoDeDados.getInstance().getConnection();
    }
    
}
