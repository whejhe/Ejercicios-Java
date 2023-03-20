
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class PruebaSubvencion {

    public static void main(String[] args) {

        Subvencion sub = new Subvencion(16000, 3000);
        sub.agregarSolicitud(new Persona("A", 23000));
        sub.agregarSolicitud(new Persona("B", 26000));
        sub.agregarSolicitud(new Persona("C", 23500));
        sub.agregarSolicitud(new Persona("D", 19600));
        sub.agregarSolicitud(new Persona("E", 21600));
        sub.agregarSolicitud(new Persona("F", 31000));
        sub.agregarSolicitud(new Persona("G", 24500));
        sub.agregarSolicitud(new Persona("H", 24500));

        sub.agregarSolicitud(new Persona("B", 23000));

        sub.adjudicaSubvencion();
        Iterator iter = sub.getAdmitidos().iterator();
        int contador = 1;
        while (iter.hasNext()) {
            Persona p = (Persona) iter.next();
            System.out.println(contador + "-" + p.getDni() + "-" + p.getRentaAnual());
            contador++;
        }
        System.out.println();
        //sub.agregarSolicitud(new Persona("B",23000));

        System.out.println("----------------------------------------------");
        iter = sub.getExcluidos().iterator();
        contador = 1;
        while (iter.hasNext()) {
            Persona p = (Persona) iter.next();
            System.out.println(contador + "-" + p.getDni() + "-" + p.getRentaAnual());
            contador++;
        }

    }
}
