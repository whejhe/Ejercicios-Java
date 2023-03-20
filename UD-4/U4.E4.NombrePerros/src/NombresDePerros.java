
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 * 
 */
public class NombresDePerros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List nombres = new ArrayList();
        nombres.add("Toby");
        nombres.add("Rocky");
        nombres.add("Max");
        nombres.add("Pancho");
        nombres.add("Coco");
        nombres.add("Chispa");
        
        System.out.println("Actualmente conozco "+nombres.size()+" nombres para perros.");
        System.out.println("Te los digo:");
        Iterator a = nombres.iterator();
        int contador=1;
        while(a.hasNext()){
            String nombre = (String)a.next();
            System.out.println(contador+"-"+nombre);
            contador++;
        }
        
        System.out.println("");
        System.out.println("También te los puedo decir en orden alfabético: ");
        Collections.sort(nombres);
        Iterator b = nombres.iterator();
        contador=1;
        while(b.hasNext()){
            String nombre = (String)b.next();
            System.out.println(contador+"-"+nombre);
            contador++;
        }
        
        System.out.println("");
        String option="";
        do{
            System.out.println("Dime más nombres de perros");
            option=sc.next();
            nombres.add(option);
            
        }while(!option.equalsIgnoreCase("fin"));
        nombres.remove(nombres.size()-1);
        
        Collections.sort(nombres);
        System.out.println("Gracias. Ahora conozco "+nombres.size()+" nombres de perros.");
        System.out.println("Te los digo en orden:");
        Iterator c = nombres.iterator();
        contador=1;
        while(c.hasNext()){
            String nombre = (String)c.next();
            System.out.println(contador+"-"+nombre);
            contador++;
        }
        
    }
}
