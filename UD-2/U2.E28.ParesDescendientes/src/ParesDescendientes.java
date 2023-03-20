
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 * 
 */
import java.util.Scanner;

public class ParesDescendientes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Dime un numero entero entre 0 y 100");
        num = sc.nextInt();

        while(num < 0 || num > 100) {
            System.out.println("El numero debe estar entre 0 y 100");
            System.out.println("Prueba otra vez");
            num = sc.nextInt();
        }

        while (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.print(num + " - ");
                num--;
            } else {
                num--;
            }
        }
    }

}
