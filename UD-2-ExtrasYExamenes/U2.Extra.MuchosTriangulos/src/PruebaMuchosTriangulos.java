
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaMuchosTriangulos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numTriangulos;
        int tamTriangulos;
        String a = "*";

        System.out.println("¿Nº de Triangulos?");
        numTriangulos = sc.nextInt();

        System.out.println("¿Tamaño de los triangulos?");
        tamTriangulos = sc.nextInt();

        for (int i = 0; i < numTriangulos; i++) {
            for (int j = 0; j < tamTriangulos; j++) {
                System.out.println(a);
                a = a + "*";
            }
            a="*";
        }
    }
}
