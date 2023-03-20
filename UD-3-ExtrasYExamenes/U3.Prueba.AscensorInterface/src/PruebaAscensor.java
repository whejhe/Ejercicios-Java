/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaAscensor {
    public static void main(String[] args) {
        
        Ascensor a = new Ascensor("Seguros SA","Caida Libre",10);
        
        a.sube(20);
        System.out.println(a.toString());
        a.sube(5);
        System.out.println(a.toString());
        a.sube(1);
        System.out.println(a.toString());
        a.baja(1);
        System.out.println(a.toString());
        a.baja(5);
        System.out.println(a.toString());
        a.baja(-1);
        System.out.println(a.toString());
        
        System.out.println("El ascensor está en la planta "+a.getPlantaActual());
        
    }
}
