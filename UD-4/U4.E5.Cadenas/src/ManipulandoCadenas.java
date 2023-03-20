
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class ManipulandoCadenas {
    public static void main(String[] args) {
        
        List cadenas = new ArrayList();
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
        
        Iterator a = cadenas.iterator();
        while(a.hasNext()){
            String cadena =(String)a.next();
            System.out.println(cadena.toUpperCase());
        }
        /*----------------------------------------------*/
        System.out.println("");
        Collections.sort(cadenas);
        Iterator b = cadenas.iterator();
        while(b.hasNext()){
            String cadena =(String)b.next();
            System.out.println(cadena.toUpperCase());
        }
        /*------------------------------------------------*/
        System.out.println("");
        Iterator c = cadenas.iterator();
        while(c.hasNext()){
            String cadena =(String)c.next();
            if(cadena.toUpperCase().startsWith("A")){
                System.out.println(cadena.toUpperCase());
            }
        }
        /*---------------------------------------------------*/
        System.out.println("");
        Iterator d = cadenas.iterator();
        while(d.hasNext()){
            String cadena =(String)d.next();
            if(cadena.endsWith("o")){
                System.out.println(cadena.toUpperCase());
            }
        }
        /*---------------------------------------------------*/
        System.out.println("");
        Iterator e = cadenas.iterator();
        while(e.hasNext()){
            String cadena =(String)e.next();
            if(cadena.contains("e")){
                System.out.println(cadena.toUpperCase());
            }
        }
        /*---------------------------------------------------*/
        System.out.println("");
        Iterator f = cadenas.iterator();
        while(f.hasNext()){
            String cadena =(String)f.next();
            if(cadena.length()==5){
                System.out.println(cadena.toUpperCase());
            }
        }
        /*---------------------------------------------------*/
        System.out.println("");
        Iterator g = cadenas.iterator();
        while(g.hasNext()){
            String cadena =(String)g.next();
            if(cadena.length()>5 && cadena.contains("A")){
                System.out.println(cadena.toUpperCase());
            }
        }
    }
}
