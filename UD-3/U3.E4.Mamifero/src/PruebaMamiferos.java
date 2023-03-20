/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaMamiferos {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Gato g = new Gato();
        Tigre t = new Tigre();
        Perro p = new Perro();
        
        System.out.print("Mamifero: ");
        m.haceRuido();
        System.out.print("El gato hace: ");
        g.haceRuido();
        System.out.print("El tigre hace: ");
        t.haceRuido();
        System.out.print("El perro hace: ");
        p.haceRuido();
       
    }
}
