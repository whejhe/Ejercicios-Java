
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class FiltrandoListas {
    public static void main(String[] args) {
        
        List cadenas = new ArrayList();
        //cadenas = new LinkedList();
        cadenas.add("Vertical");
        cadenas.add("Horizontal");
        cadenas.add("Izquierda");
        cadenas.add("Derecha");
        cadenas.add("Adelante");
        cadenas.add("Atras");
        cadenas.add("Curvo");
        cadenas.add("Recto");
        cadenas.add("Arriba");
        cadenas.add("Abajo");
        
        Collections.sort(cadenas);
        System.out.println(cadenas.toString());
        //System.out.println(cadenas);
        
        Iterator a = cadenas.iterator();
        while(a.hasNext()){
            String cadena = (String)a.next();
            if(cadena.endsWith("o")){
                a.remove();
            }
        }
        System.out.println(cadenas);
        /*---------------------------------------------------*/
        a = cadenas.iterator();
        while(a.hasNext()){
            String cadena = (String)a.next();
            if(cadena.contains("t")){
                a.remove();
            }
        }
        System.out.println(cadenas);
        /*---------------------------------------------------*/
        a = cadenas.iterator();
        while(a.hasNext()){
            String cadena = (String)a.next();
            if(cadena.contains("a") && cadena.length()>5){
                a.remove();
            }
        }
        System.out.println(cadenas);
        
    }
}
