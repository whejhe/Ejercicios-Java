package prueba.evaluable.impresora;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaImpresora {
    public static void main(String[] args) {
        
        Impresora i1 = new Impresora("Hp","ghjgj",1995,50);
        //i1.recarga(40);
        i1.encender();
        i1.imprimir();
        i1.mostrarEstado();
        
        System.out.println("");
        
        Impresora i2 = new Impresora("Kodak","K5",2020);
        i2.imprimir(2000);
        i2.encender();
        i2.imprimir(2000);
        i2.apagar();
        i2.recarga(3);
        i2.encender();
        i2.imprimir();
        i2.mostrarEstado();
        i2.recarga();
        i2.imprimir(5);
        i2.mostrarEstado();
    }
}
