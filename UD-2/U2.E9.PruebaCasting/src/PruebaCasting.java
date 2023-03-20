/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaCasting {
    public static void main(String[] args) {
        
        PersonaCondicional p = new PersonaCondicional();
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Edad:");
        p.setEdad(sc.nextInt());
        
        System.out.println("Altura(cm):");
        p.setAltura(sc.nextInt());
        
        System.out.println("¿Esta Casado?");
        p.setEstaCasado(sc.nextBoolean());
        
        if(p.getEdad()>=18 && p.getEdad()<=30 && p.isEstaCasado()==false && p.getAltura()>175){
            System.out.println("Has conseguido el papel");
        }else if(p.getEdad()>30 && p.getEdad()<40 && p.isEstaCasado()==false && p.getAltura()>190){
            System.out.println("Has conseguido el papel");
        }else if(p.getEdad()>=40 || p.isEstaCasado()==true){
            System.out.println("Has conseguido el papel");
        }else{
            System.out.println("No siento, no te queremos aqui");
        }
        
    }
}
