
import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaConjuntos {
    public static void main(String[] args) {
        
        Set candidatos = new HashSet();
        candidatos.add("Juan");
        candidatos.add("Ana");
        candidatos.add("Pedro");
        candidatos.add("Rosa");
        candidatos.add("Maria");
        
        System.out.println("¿Esta el conjunto vacio? "+candidatos.isEmpty());
        System.out.println("¿Cuantos candidatos tenemos? "+candidatos.size());
        System.out.println("¿Esta el candidato Pedro? "+candidatos.contains("Pedro"));
        
        Iterator iter = candidatos.iterator();
        while(iter.hasNext()){
            String candidato = (String) iter.next();
            System.out.println("Candidato: "+candidato);
        }
        
        Set seleccionados = new HashSet();
        iter = candidatos.iterator();
        while(iter.hasNext()){
            String candidato = (String) iter.next();
            if(candidato.contains("a")){
                seleccionados.add(candidato);
            }
        }
        System.out.println("");
        System.out.println("SELECCIONADOS");
        
        iter = seleccionados.iterator();
        while(iter.hasNext()){
            String seleccionado = (String) iter.next();
            System.out.println("Seleccionado: "+seleccionado);
        }
 
        
    }
}
