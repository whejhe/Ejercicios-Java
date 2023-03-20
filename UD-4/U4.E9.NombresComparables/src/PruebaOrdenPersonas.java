
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaOrdenPersonas {
    public static void main(String[] args) {
        
        List personas = new ArrayList();
        Persona p1 = new Persona("Juan","53276349T",30);
        Persona p2 = new Persona("Ana","56276348F",20);
        Persona p3 = new Persona("Sara","43174340A",28);
        Persona p4 = new Persona("Manuel","43374369B",42);
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
                
        System.out.println(personas.toString());
        //System.out.println(personas);
        
        Collections.sort(personas);
        System.out.println(personas.toString());
        
        
    }
}
