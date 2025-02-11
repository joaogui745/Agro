
package permanencia.interfaces;

import modelos.Pastor;

public interface PastorDAOI {
    boolean criar(Pastor pastor);
    Pastor buscarPorNis(String nis);
}
