
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class ColaPaciente {

    private List<Paciente> cola;

    public ColaPaciente() {
        cola = new ArrayList<>();
    }

    public void agregaPaciente(Paciente p) {
        cola.add(p);
    }

    public void vacunaSiguientePaciente() throws ColaVaciaException {
        if (cola.isEmpty()) {
            throw new ColaVaciaException("Todos los pacientes están vacunados");
        }else{
            try{
                Paciente p = cola.get(0);
                p.vacunar();
                System.out.println(p.getNombre()+" se ha vacunado");
            }catch(PacienteVacunadoException e){
                System.out.println("¡Hay que estar aburrido para querer vacunarse 2 veces!");
            }finally{
                cola.remove(0);
            }
        }

    }

}
