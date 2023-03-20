/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class Lavadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("MENU DE OPCIONES");
        System.out.println("Lavado corto");
        System.out.println("1 - Prelavado");
        System.out.println("2 - Lavado");
        System.out.println("3 - Centifugado");
        System.out.println("4 - Fin");
        System.out.println("");
        System.out.println("Lavado Largo");
        System.out.println("5 - Prelavado");
        System.out.println("6 - Lavado en caliente");
        System.out.println("7 - Centrifugado 1");
        System.out.println("8 - Lavado en frio");
        System.out.println("9 - Suavizante");
        System.out.println("10 - Centrifugado 2");
        System.out.println("11 - Secado");
        System.out.println("12 - Fin");
        System.out.println("");
        System.out.println("Escoge una opcion de lavado");
        opcion=sc.nextInt();
        
        /*while(opcion<1 || opcion>12){
            System.out.println("Opción Incorrecta");
            System.out.println("Prueba otra vez:");
            opcion=sc.nextInt();
        }*/
        
        switch(opcion){
            case 1:
                System.out.println("1 - Prelavado");
            case 2:
                System.out.println("2 - Lavado");
            case 3:
                System.out.println("3 - Centifugado");
            case 4:
                System.out.println("4 - Fin");
                break;
            case 5:
                System.out.println("5 - Prelavado");
            case 6:
                System.out.println("6 - Lavado en caliente");
            case 7:
                System.out.println("7 - Centrifugado 1");
            case 8:
                System.out.println("8 - Lavado en frio");
            case 9:
                System.out.println("9 - Suavizante");
            case 10:
                System.out.println("10 - Centrifugado 2");
            case 11:
                System.out.println("11 - Secado");
            case 12:
                System.out.println("12 - Fin");
                break;
            default:
                System.out.println("Opción Incorrecta");
        }
        
    }
}
