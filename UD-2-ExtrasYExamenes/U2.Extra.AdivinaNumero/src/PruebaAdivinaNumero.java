/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Random;

public class PruebaAdivinaNumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int intento;
        boolean acierto=false;
        int adivina=(int)(rnd.nextDouble()*100+1);
        
        
        do{
            System.out.println("¿Dime que nº crees que es?");
            intento=sc.nextInt();
            
            if(adivina==intento){
            System.out.println("Acertaste!!");
            acierto=true;
            }else if(adivina>intento){
            System.out.println("El numero a adivinar es mayor que "+intento);
            }else{
            System.out.println("El numero a adivinar es menor que "+intento);
            }
        }while(acierto==false);
        
        
        
    }
}
