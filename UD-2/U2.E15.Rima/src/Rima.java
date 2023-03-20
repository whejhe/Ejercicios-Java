
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class Rima {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero del 1 al 5");
        int numero = sc.nextInt();

        /*while (numero < 1 || numero > 5) {
            System.out.println("Introduce un numero correcto (1-5)");
            numero = sc.nextInt();
        }*/
        switch (numero) {
            case 1:
                System.out.println("Con uno no sumo");
                break;
            case 2:
                System.out.println("Contador trasdós");
                break;
            case 3:
                System.out.println("Mi mes");
                break;
            case 4:
                System.out.println("Declaro formato");
                break;
            case 5:
                System.out.println("Canto al Cinco, Bingo!");
                break;
            default:
                System.out.println("No me se ninguna rima con el "+numero);
                break;

        }

    }
}
