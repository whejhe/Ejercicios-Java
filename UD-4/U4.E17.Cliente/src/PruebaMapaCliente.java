
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaMapaCliente {
    public static void main(String[] args) {
        
        Map clientes = new HashMap();
        Cliente c1 = new Cliente(1,"Antonio","Carrasco");
        Cliente c2 = new Cliente(2,"Violeta","Gomez");
        Cliente c3 = new Cliente(3,"Paula","Martin");
        Cliente c4 = new Cliente(2,"Paul","Dominguez");
        
        clientes.put(1, c1);
        clientes.put(2, c2);
        clientes.put(3, c3);
        
        Collection col = clientes.values();
        Iterator iter = col.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("------------------------------------------------");
        clientes.remove(1);
        clientes.replace(2, c2,c4);
        iter = col.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        
    }
}
