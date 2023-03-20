
import java.util.ArrayList;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaNombresUnicos {
    public static void main(String[] args) {
        
        NombresUnicos misNombres = new NombresUnicos(new ArrayList());
        
        misNombres.agregaNombre("Juan");
        misNombres.agregaNombre("Ana");
        misNombres.agregaNombre("Pedro");
        misNombres.agregaNombre("Celia");
        
        misNombres.ordenaNombres();
        misNombres.contiene("ANA");
        misNombres.imprimeNombres();
        
    }
}
