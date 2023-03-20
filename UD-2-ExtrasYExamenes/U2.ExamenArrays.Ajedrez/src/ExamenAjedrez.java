
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class ExamenAjedrez {

    public static void main(String[] args) {

        String[] movimientos = {"A2a4", "H7h5", "D2d4", "H5h3", "F1g3", "G8f6", "B2b4", "A7a5", "C2c4", "D5d3",
            "A1a3", "H8g6", "C2c4", "A5a3", "D1h3", "A8f8", "B2h2", "A7f3", "C2g6", "F5b3",
            "G2f4", "H7c5", "A2f4", "H3h8", "A1g3", "A5f6", "C7b4", "C4b5", "B4d5", "G5h3"};
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int numMovimiento = 0;
        String buscaMovimiento;
        String color;
        boolean encontrado;

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("0-Salir");
            System.out.println("1-Mostrar movimientos de las blancas");
            System.out.println("2-Mostrar movimientos de las negras");
            System.out.println("3-Mostrar todos los movimientos");
            System.out.println("4-Buscar movimiento");
            System.out.println("--------------------------------------");
            System.out.println("");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Adiós");
                    break;
                case 1:
                    System.out.println("Comienzo de los movimientos de las piezas blancas");
                    for (int i = 0; i < movimientos.length; i++) {
                        if (i % 2 == 0) {
                            System.out.print(movimientos[i] + " ");
                        }
                    }
                    System.out.println("");
                    System.out.println("Fin de los movimientos de las piezas blancas");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Comienzo de los movimientos de las piezas negras");
                    for (int i = 0; i < movimientos.length; i++) {
                        if (i % 2 != 0) {
                            System.out.print(movimientos[i] + " ");
                        }
                    }
                    System.out.println("");
                    System.out.println("Fin de los movimientos de las piezas negras");
                    System.out.println("");
                    break;
                case 3:
                    numMovimiento = 0;
                    for (int i = 0; i < movimientos.length; i++) {
                        numMovimiento++;
                        if (i % 2 == 0) {
                            color = "Blancas";
                        } else {
                            color = "Negras";
                        }
                        System.out.println(numMovimiento + "-" + color + "-" + movimientos[i]);
                    }
                    System.out.println("");
                    break;
                case 4:
                    encontrado=false;
                    numMovimiento = 0;
                    System.out.println("¿Que movimiento quieres buscar?");
                    buscaMovimiento = sc.next();
                    for (int i = 0; i < movimientos.length; i++) {
                        numMovimiento++;
                        if (i % 2 == 0) {
                            color = "Blancas";
                        } else {
                            color = "Negras";
                        }
                        if (movimientos[i].equalsIgnoreCase(buscaMovimiento)) {
                            System.out.println("Movimiento encontrado en la posición " + numMovimiento
                                    + " correspondiente a las piezas " + color);
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("Movimiento no encontrado");
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    System.out.println("");
                    break;
            }
        } while (option != 0);

    }
}
