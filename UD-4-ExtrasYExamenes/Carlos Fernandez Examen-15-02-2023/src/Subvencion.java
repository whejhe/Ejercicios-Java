
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Subvencion {

    private double presupuesto;
    private double cantPorPersona;
    private List solicitantes;
    private boolean plazoAbierto = true;
    private Set admitidos;
    private Set excluidos;
    private int contador;

    public Subvencion(double presupuesto, double cantPorPersona) {
        this.presupuesto = presupuesto;
        this.cantPorPersona = cantPorPersona;
        this.solicitantes = new ArrayList();
        this.admitidos = new HashSet();
        this.excluidos = new HashSet();
    }

    public void agregarSolicitud(Persona per) {
        contador++;
        if (plazoAbierto == true) {
            solicitantes.add(per);
        } else if (plazoAbierto == false) {
            System.out.println("El plazo de solicitud esta cerrado");
        } else if (solicitantes.contains(per)) {
            System.out.println(per + " Ya tiene una solicitud en curso");
            solicitantes.remove(per);
            solicitantes.add(contador, per);

        }

    }

    public void adjudicaSubvencion() {
        plazoAbierto = false;
        Collections.sort(solicitantes);
        Iterator iter = solicitantes.iterator();
        while (iter.hasNext()) {
            if (presupuesto >= cantPorPersona) {
                admitidos.add(iter.next());
                presupuesto = presupuesto - cantPorPersona;
            } else {
                excluidos.add(iter.next());
            }
        }
    }

    public Set getAdmitidos() {
        System.out.println("Lista de Admitidos: ");
        return admitidos;
    }

    public Set getExcluidos() {
        System.out.println("Lista de Excluidos: ");
        return excluidos;
    }

}
