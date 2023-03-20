/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaImpresora {
    public static void main(String[] args) {
        
        Impresora imp = new Impresora();
        Documento apuntes = new Documento("Marca","blablablabla",4);
        Documento apuntes2 = new Documento("Consultas","blablablabla",3);
        
        imp.setMarca("HP");
        imp.setModelo("Laserjet 2000");
        imp.cargarBandeja(5);
        
        //imp.encender();
        System.out.println(imp.getEstado());
        imp.imprimir(apuntes);
        System.out.println(imp.getEstado());
        //imp.cargarBandeja(4);
        //imp.apagar();
        //imp.encender();
        imp.imprimir(apuntes2);
        System.out.println(imp.getEstado());
        
        
    }
}
