
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaRecursos {
    public static void main(String[] args) {
        
        Set recursos = new HashSet();
        
        Autor ken = new Autor("Ken", "Follet", "Británica");
        recursos.add(new Recursos(9788401328510L, "Los pilares de la tierra", ken, 10));
     
        Autor ilde = new Autor("Ildefonso", "Falcones", "Española");
        recursos.add(new Recursos(9788499088044L, "La catedral del mar", ilde, 8));
        
        List autores = new ArrayList();
        autores.add(new Autor("Howard Phillips", "Lovecraft", "Estadounidense"));
        autores.add(new Autor("Alexandre", "Dumas", "Francesa"));
        recursos.add(new Recursos(9788417244712L, "Los mejores cuentos para leer a media noche", autores, 3));
        
        Iterator iter = recursos.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        
    }
}
