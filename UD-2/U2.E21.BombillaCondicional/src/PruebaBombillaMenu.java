
import java.util.Scanner;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaBombillaMenu {

    public static void main(String[] args) {

        BombillaCondicional b = new BombillaCondicional();
        Scanner sc = new Scanner(System.in);
        int option;

        do {

            System.out.println("MENU DE OPCIONES");
            System.out.println("0 - Salir");
            System.out.println("1 - Encender");
            System.out.println("2 - Apagar");
            System.out.println("3 - Imprime Estado");
            System.out.println("4 - Crea una nueva bombilla");
            System.out.println("Escoge una opción");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    b.encender();
                    System.out.println("");
                    break;
                case 2:
                    b.apagar();
                    System.out.println("");
                    break;
                case 3:
                    b.imprimeEstado();
                    System.out.println("");
                    break;
                case 4:
                    b = new BombillaCondicional();
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while(option!=0);

    }

}
