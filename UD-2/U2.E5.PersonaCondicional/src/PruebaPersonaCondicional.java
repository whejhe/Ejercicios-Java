/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaPersonaCondicional {
    public static void main(String[] args) {
        PersonaCondicional p=new PersonaCondicional();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("¿Que edad tienes?");
        p.setEdad(sc.nextInt());
        
        System.out.println("¿Cuanto mides?(cm)");
        p.setAltura(sc.nextInt());
        p.setEstaCasado(false);
        
        if(p.getEdad()>=18){
            System.out.println("Ya eres un señor/a");
        }else{
            System.out.println("Todavia eres muy joven");
        }
        if(p.getAltura()>=185){
            System.out.println("Eres alto/a");
        }else{
            System.out.println("No eres muy alto");
        }
        if(p.isEstaCasado()==false){
            System.out.println("No esta casado");
        }else{
            System.out.println("Estas casado");
        }
    }
}
