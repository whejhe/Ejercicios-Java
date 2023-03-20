
import java.util.Scanner;

public class EstudioNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Trim1, Trim2, Trim3;

        System.out.println("Dime La nota del primer Trimestre");
        Trim1 = sc.nextDouble();

        System.out.println("Dime La nota del segundo Trimestre");
        Trim2 = sc.nextDouble();

        System.out.println("Dime La nota del tercer Trimestre");
        Trim3 = sc.nextDouble();

        System.out.println("Las notas obtenidas son: Trim1= " + Trim1 + ", Trim2= " + Trim2 + " y Trim3= " + Trim3);

        double aritmetica = (Trim1 + Trim2 + Trim3) / 3;
        System.out.println("La nota final calculada con media aritmética = " + aritmetica);
        double porcentaje40T1 = Trim1 * 0.40 * 3;
        double porcentaje40T2 = Trim2 * 0.40 * 3;
        double porcentaje20 = Trim3 * 0.20 * 3;
        double porcentaje = (porcentaje40T1 + porcentaje40T2 + porcentaje20) / 3;
        System.out.println("La nota final calculada con los porcentajes = " + porcentaje);

    }
}
