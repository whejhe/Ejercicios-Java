/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaTeclado {
    public static void main(String[] args) {
        
        Teclado t = new Teclado();
        
        t.leeEntero();
        t.leeEntero(5, 10);
        t.leeEnteroMax(20);
        t.leeEnteroMin(10);
    }
}
