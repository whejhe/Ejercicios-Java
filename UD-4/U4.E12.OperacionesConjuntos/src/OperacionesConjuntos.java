
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class OperacionesConjuntos {
    public static void main(String[] args) {
        
        Set buscaPolicia = new HashSet();
        buscaPolicia.add("12345678A");
        buscaPolicia.add("12345678B");
        buscaPolicia.add("12345678C");
        buscaPolicia.add("12345678D");
        
        Set buscaGuardia = new HashSet(Arrays.asList("12345678E", "12345678F", "12345678G", "12345678D"));
        
        Set buscados = new HashSet(buscaPolicia);
        buscados.addAll(buscaGuardia);
        System.out.println("Buscados por ambos: "+buscados);
        
        /*--------------------------------------------------------------------*/
        
        buscados.removeAll(buscados);
        buscados = new HashSet(buscaPolicia);
        buscados.add(buscaGuardia);
        System.out.println("Todos los Buscados: "+buscados);
        
        /*--------------------------------------------------------------------*/
        
        buscados.remove(buscaGuardia);
        System.out.println("Buscados por policia: "+buscados);
        
        /*---------------------------------------------------------------------*/
        
        buscados.removeAll(buscaPolicia);
        buscados.add(buscaGuardia);
        System.out.println("Buscados por la Guardia: "+buscados);
       
    }
}
