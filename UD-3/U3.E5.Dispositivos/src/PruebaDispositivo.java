/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaDispositivo {
    public static void main(String[] args) {
        
        Procesador p = new Procesador();
        memoria m = new memoria();
        tarjetaVideo t = new tarjetaVideo();
        
        p.encender();
        p.suma(3, 7);
        p.resta(7, 3);
        p.dividir(10, 2);
        p.multiplicacion(7, 2);
        p.getNumOperaciones();
        
        System.out.println("------------------------------");
        
        m.encender();
        m.setPosicion(0, 1);
        m.setPosicion(10, 2);
        m.getPosicion(1);
        m.resumen();
        
        System.out.println("-------------------------------");
        
        t.encender();
        t.setMuestraText("Hola mundo");
        t.getMuestraText();
    }
}
