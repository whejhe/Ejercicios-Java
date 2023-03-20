
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class PruebaNotas {
    public static void main(String[] args) {
        
        Notas n = new Notas();
              
        System.out.println(Arrays.toString(n.getNota()));
        
        double array[] = n.getNota();//debo guardar el resultado del metodo en una nueva array para poder recorrerla
        for(int i=0;i<n.getNota().length;i++){
            System.out.println(array[i]);
        }
        
        
        for(double elem : n.getNota()) {//En este caso no necesitamos crear una nueva array
            System.out.println(elem);
        }
    }
}
