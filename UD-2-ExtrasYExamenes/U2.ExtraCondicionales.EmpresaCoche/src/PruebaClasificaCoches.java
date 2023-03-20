/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaClasificaCoches {
    public static void main(String[] args) {
        
        Coche c = new Coche();
        clasificaCoche cc = new clasificaCoche();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Potencia:");
        c.setPotencia(sc.nextInt());
        
        System.out.println("Años de Antiguedad:");
        c.setAniosAntiguedad(sc.nextInt());
        
        System.out.println("¿Es Electrico? (true/false)");
        c.setElectrico(sc.nextBoolean());
        
        System.out.println("¿Tiene airbag? (true/false)");
        c.setAirbag(sc.nextBoolean());
        
        System.out.println("¿Tiene ABS? (true/false)");
        c.setABS(sc.nextBoolean());
        
        switch(cc.clasificaCoche(c)){
            case 1:
                System.out.println("El coche pertenece a la categoria Superior");
                break;
            case 2:
                System.out.println("El coche pertenece a la categoria Intermedia");
                break;
            case 3:
                System.out.println("El coche pertenece a la categoria Basica");
                break;
        }
        
    }
}
