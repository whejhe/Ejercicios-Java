
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class ProcesoSeleccionMain {

    public static void main(String[] args) {

        Persona p = new Persona();

        p.setNombre("Luisa");
        p.setAniosEnFront(3);
        p.setAniosEnBack(4);
        p.setSabeAngular(false);
        p.setSabeReact(true);
        p.setSabeSpring(true);
        p.setSabeLaravel(true);
        p.setCochePropio(false);
        p.setDisponibleViajes(true);

        System.out.println("FASE DE SELECCION");

        if (p.getAniosEnFront() >= 2 && (p.isSabeAngular() == true || p.isSabeReact() == true)) {
            System.out.println(p.getNombre() + " supera la primera fase");
            if (p.getAniosEnBack() >= 2 && p.getAniosEnBack() <= 5 && p.isSabeSpring() && p.isSabeLaravel()) {
                System.out.println(p.getNombre() + " supera la segunda fase");
                if (p.isCochePropio() == true || p.isDisponibleViajes() == true) {
                    System.out.println(p.getNombre() + " supera la tercera fase");
                } else {
                    System.out.println(p.getNombre() + " NO supera la tercera fase");
                }
            } else {
                System.out.println(p.getNombre() + " NO supera la segunda fase");
            }
        } else {
            System.out.println(p.getNombre() + " NO supera la primera fase");
        }
    }
}
