/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class NombrePerros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] nombres={"Toby","Rocky","Filete","Perruedines","Torrija"};
        String option;
        int pos=0;
        
        System.out.println("Dime un nombre de perro");
        option=sc.next();
        
        for(int i=0;i<nombres.length;i++){
            if(nombres[i].equalsIgnoreCase(option)){
                pos=i;
                System.out.println("El nombre "+nombres[i]+" ocupa el puesto "+(pos+1)+" del TOP 5");
                break;
            }else if(i==nombres.length-1){
                System.out.println("El nombre "+option+" no esta en el TOP 5 de nombres de perros");
            }
        }
        
        
    }
    
}
