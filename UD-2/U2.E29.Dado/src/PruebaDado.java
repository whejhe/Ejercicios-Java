        /**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaDado {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        Dado d=new Dado();
        int option;
        int tirada;
        int contador=0;
        
        do{
            System.out.println("Dime un nº entre 1 y 6");
            option=sc.nextInt();
            if(option<1 || option>6){
                System.out.println("ERROR!!, eL Nº debe estar entre 1 y 6");
            }
        }while(option<1 || option>6);
        
        do{
            tirada=d.tirada();
            contador++;
            System.out.println("Ha salido el "+tirada);
        }while(option!=tirada);
        
        System.out.println("Tu Nº es el "+option);
        System.out.println("Has tirado "+contador+" veces");
        
    }
}
