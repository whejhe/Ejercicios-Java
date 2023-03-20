
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaDado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dado d = new Dado();
        int numDeseado;
        int contador = 0;

        System.out.println("¿Que numero te gustaria que saliera?");
        numDeseado = sc.nextInt();

        while (numDeseado < 1 || numDeseado > 6) {
            System.out.println("El numero debe estar entre 1 y 6, dime otro");
            numDeseado = sc.nextInt();
        }
        if (contador <= 3 && d.tirada() != numDeseado) {
            do {
                System.out.println("A salido el " + d.tirada());
            } while (contador < 3);
        }else if(contador <= 3 && d.tirada() == numDeseado){
            System.out.println("A salido el "+d.tirada());
            contador++;
        }
    }
}
