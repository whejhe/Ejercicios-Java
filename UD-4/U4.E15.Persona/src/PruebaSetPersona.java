
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaSetPersona {
    public static void main(String[] args) {
        
        Persona p = new Persona("12345678A","Juan","Perez Garcia","555-555-555","C/Falsa 123",35,true,true);
        Persona p2 = new Persona("87654321B","Marta","Rodriguez Fernandez","555-555-556","c/Falsa 124",32,false,true);
        Persona p3 = new Persona("11223344C","Laura","Gonzalez Lopez","555-555-557","C/Falsa 125",27,false,false);
        
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        
        Set personas = new HashSet();
        personas.add(p);
        personas.add(p2);
        personas.add(p3);
        
        Iterator iter = personas.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
    }
}
