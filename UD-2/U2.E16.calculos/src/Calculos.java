/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero para los calculos");
        double numero = sc.nextDouble();
        int opcion;
        
        System.out.println("MENU DE POTENCIAS");
        System.out.println("1 - Calcular el cuadrado");
        System.out.println("2 - Calcular cubo");
        System.out.println("3 - Calcular la raiz cuadrada");
        System.out.println("Escoja una opción:");
        opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                double cuadrado=Math.pow(numero, 2);
                System.out.println("El cuadrado de "+numero+" es "+cuadrado);
                break;
            case 2:
                double cubo=Math.pow(numero,3);
                System.out.println("El cubo de "+numero+" es "+cubo);
                break;
            case 3:
                double raiz=Math.pow(numero, 0.5);
                //raiz=Math.sqrt(numero);
                System.out.println("La raiz cuadrada de "+numero+" es "+raiz);
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
    }
}
