
package agro;

import bancodedados.BancoDeDados;
import java.sql.SQLException;
import modelos.Proprietario;
import org.sqlite.SQLiteErrorCode;
import permanencia.sqlite.ProprietarioDAO;
import telas.Principal;

public class AGRO {

    public static void main(String[] args) {
        Principal telaMenu = new Principal();
        telaMenu.setVisible(true);
    }
    
}
