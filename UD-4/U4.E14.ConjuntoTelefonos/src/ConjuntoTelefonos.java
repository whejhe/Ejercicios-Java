
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class ConjuntoTelefonos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set permitidos = new HashSet();
        Set prohibidos = new HashSet();
        int numero;
        
        /*675237449*/
        /*645984827*/
        /*687328540*/
        
        do{
            System.out.println("Introduce el nº de telefono: ");
            numero=sc.nextInt();
            permitidos.add(numero);
        }while(numero>0);
                
        do{
            System.out.println("Introduce los nº de telefonos prohibidos: ");
            numero=sc.nextInt();
            prohibidos.add(numero);
        }while(numero>0);
        
        System.out.println("ESTAN LLAMANDO");
        numero=sc.nextInt();
        
        if(permitidos.contains(numero)){
            System.out.println("El "+numero+" está PERMITIDO, puedes atender la llamada");
        }else if(prohibidos.contains(numero)){
            System.out.println("El "+numero+" está PROHIBIDO, cuelga");
        }else{
            System.out.println("El "+numero+" no es un número conocido, haz lo que creas");
        }
    }
}
