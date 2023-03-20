
import java.util.Scanner;

public class PruebaScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String nombre = sc.nextLine();

        System.out.println("Dime tu primer apellido");
        String apellido1 = sc.nextLine();

        System.out.println("Dime un numero entero:");
        int num1 = sc.nextInt();
        System.out.println("Numero elegido: " + num1);

        System.out.println("Dime otro numero entero:");
        int num2 = sc.nextInt();
        System.out.println("Numero elegido: " + num2);

        System.out.println("Te llamas " + nombre + " " + apellido1);

        int resSuma = num1 + num2;
        int resProducto = num1 * num2;
        System.out.println("Los números leídos son " + num1 + " y " + num2 + "\n"
                + "Su suma es " + resSuma + " y su producto es " + resProducto);

    }
}
