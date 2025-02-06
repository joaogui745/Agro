package bancodedados;

import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class BancoDeDados {
    private static BancoDeDados instancia = null;
    private Connection connection = null;
    private BancoDeDados() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:data.db");
            try (Statement comando = connection.createStatement()) {
                comando.setQueryTimeout(30);
                comando.addBatch(LeitorDeArquivos.carregaArquivo("path"));
            }
        } catch (SQLException | IOException ex ) {
            System.out.println(ex);
        }
       
    }
    
    public static BancoDeDados getInstance(){
        if (instancia == null){
            instancia = new BancoDeDados();
        }
        return instancia;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void closeConnection() throws SQLException{
        this.connection.close();
    }
    
}
