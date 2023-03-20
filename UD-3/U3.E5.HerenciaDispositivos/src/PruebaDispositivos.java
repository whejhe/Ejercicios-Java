/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaDispositivos {
    public static void main(String[] args) {
        
        Procesador p = new Procesador();
        RAM r = new RAM();
        tarjetaVideo t = new tarjetaVideo();
        
        p.encender();
        p.apagar();
        p.setSuma(5, 2);
        System.out.println("Suma: "+p.getSuma());
        p.setResta(10, 7);
        System.out.println("Resta: "+p.getResta());
        p.setMultiplicar(6, 2);
        System.out.println("Multiplicacion: "+p.getMultiplicar());
        p.setDividir(6, 3);
        System.out.println("Division: "+p.getDividir());
        p.numOperaciones();
    }
}
