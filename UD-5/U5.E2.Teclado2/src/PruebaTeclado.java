/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaTeclado {
    public static void main(String[] args) {
        
        Teclado t = new Teclado();
        int entero;
        
        //t.leeEntero();
        //t.leeEntero(5, 10);
        //t.leeEnteroMax(20);
        //t.leeEnteroMin(10);
        entero = t.leerBinario();
        System.out.println("El número leído es: "+entero);
        
        entero = t.leerOctal();
        System.out.println("El numero en octal es "+entero);
        
        entero = t.leerHex();
        System.out.println("El numero en hexadecimal es "+entero);
    }
}
