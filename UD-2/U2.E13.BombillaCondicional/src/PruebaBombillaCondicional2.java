/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaBombillaCondicional2 {
    public static void main(String[] args) {
        BombillaCondicional bc = new BombillaCondicional();
        
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        
        bc.apagar();
        bc.encender();
        
        System.out.println("La bombilla se ha encendido "+bc.getNumVecesEncendida()+" veces");
        
        bc.imprimeEstado();
        
    }
}
