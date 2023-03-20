
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class NombresUnicos {
    
    List nombres;

    public NombresUnicos(List nombres) {
        this.nombres=new ArrayList(nombres);
    }
    
    public void agregaNombre(String nombre){
        nombres.add(nombre);
    }
    
    public void ordenaNombres(){
        Collections.sort(nombres);
    }
    
    public void imprimeNombres(){
        Iterator iter = nombres.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
    public boolean contiene(String nombre){
        if(nombres.contains(nombre.toLowerCase())){
            System.out.println(nombre+" se encuentra en la lista");
            return true;
        }else{
            System.out.println(nombre+" NO se encuentra en la lista");
            return false;
        }
    }
}
