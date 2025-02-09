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
            connection = DriverManager.getConnection("jdbc:sqlite::memory:");
            try (Statement comando = connection.createStatement()) {
                comando.setQueryTimeout(30);
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Proprietario.sql"));
                comando.addBatch(LeitorDeArquivos.carregaArquivo("bancodedados/scripts/Fazenda.sql"));
                comando.addBatch("""
                                 INSERT INTO proprietario(email, cpf, senha, nome, telefone) 
                                 VALUES('joao@unb.br', '777.777.777-77', 'senha', 'João Botão', '4002-8922');
                                 """);
                comando.addBatch("""
                                 INSERT INTO fazenda (areaTotal, estado, nome, email) VALUES
                                 (100.0, 'Goiás', 'Fazenda Boi Branco', 'joao@unb.br'),
                                 (500.0, 'Minas Gerais', 'Fazenda Serra da Mantiqueira', 'joao@unb.br'),
                                 (200.0, 'Mato Grosso', 'Fazenda Chapadão', 'joao@unb.br'),
                                 (300.0, 'São Paulo', 'Fazenda Jatobá', 'joao@unb.br'),
                                 (400.0, 'Rio de Janeiro', 'Fazenda Vista Alegre', 'joao@unb.br');
                                 """);
                comando.executeBatch();
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
