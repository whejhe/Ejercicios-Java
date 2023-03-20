
import java.util.Scanner;

public class PruebaMenu {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entero (a): ");
        int a = sc.nextInt();
        System.out.println("Dime un número entero (b): ");
        int b = sc.nextInt();
        int  opcion;

        do {
            
            System.out.println("MENU DE OPCIONES: ");
            System.out.println("0 - Salir");
            System.out.println("1 - Suma (a+b)");
            System.out.println("2 - Multiplicación (a*b)");
            System.out.println("3 - División entera (a/b)");
            System.out.println("Escoge una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("El resultado es " + (a + b));
                    break;
                case 2:
                    System.out.println("El resultado es " + (a * b));
                    break;
                case 3:
                    System.out.println("El resultado es " + (a / b));
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println("");
                    break;
            }
        } while (opcion!=0);
        System.out.println("Aaaadios");

    }
}
