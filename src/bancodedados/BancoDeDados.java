package bancodedados;

import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDeDados {
    private static BancoDeDados instancia = null;
    private Connection connection = null;
    private BancoDeDados() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite::memory:");
            try (Statement comando = connection.createStatement()) {
                comando.setQueryTimeout(30);
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Proprietario.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Fazenda.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Pastor.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Local.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Veterinario.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Grupo.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/RelVeterinarioGrupo.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Racao.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Racao.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Animal.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Caderneta.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Vacina.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/RelCadernetaVacina.sql"));
                
                // Inserção de uma view
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/LocalidadesPorProprietario.sql"));
                // Inserção de Dados
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/dados/Proprietario.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/dados/Fazenda.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/dados/Pastor.sql"));
                comando.executeBatch();
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
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
