
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaListas {
    public static void main(String[] args) {
        
        List meses = new ArrayList();
        
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        
        System.out.println("¿La lista esta vacia? ");
        if(meses.isEmpty()==true){
            System.out.println("No, no esta vacia");
        }else{
            System.out.println("Si,esta vacia");
        }
        System.out.println("");
        System.out.println("¿Cuantos elementos tiene? "+meses.size());
        System.out.println("");
        
        System.out.println("¿Contiene el mes Henero?");
        if(meses.contains("Henero")){
            System.out.println("Si, lo contiene");
        }else{
            System.out.println("No, no lo contiene");
        }
        
        System.out.println(meses);
        
        Iterator iter = meses.iterator();
        
        while(iter.hasNext()){
            String mes = (String)iter.next();
            System.out.println("Mes: "+mes);
        }
        
        Collections.sort(meses);//Ordena la lista
        System.out.println("Lista ordenada: "+meses);
        Iterator iter2 = meses.iterator();
        while(iter2.hasNext()){
            String mes = (String)iter2.next();
            System.out.println("Mes: "+mes);
        }
        
        meses.clear();
        System.out.println("Lista: "+meses);
       
    }
}
