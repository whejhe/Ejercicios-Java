
/**
 *
 * @author usuario
 */
public class PruebaImpresora {

    public static void main(String[] args) {

        Impresora i = new Impresora("Epson", "r30", 0, 50);

        i.encender();
        i.imprimir();
        i.mostrarEstado();
        System.out.println("");

        Impresora i2 = new Impresora("kodak", "k5", 2020);
        i2.imprimir(1000);
        i2.encender();
        i2.imprimir(1000);
        i2.apagar();
        i2.recargar(3);
        i2.encender();
        i2.imprimir();
        i2.mostrarEstado();

        i2.recargar(30);
        i2.imprimir(5);
        i2.mostrarEstado();

    }
}
