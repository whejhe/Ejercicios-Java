
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * version 1.0
 */
public class ColaPacientes{
    
    List<Paciente> cola;
    private boolean colaVacia;

    public ColaPacientes() {
        this.cola = new ArrayList();
    }

    public void agregaPaciente(Paciente p){
        cola.add(p);
        colaVacia=false;
    }
    
    public void vacunaSiguientePaciente(Paciente p){
        if(colaVacia==true){
            System.out.println("No quedan pacientes que vacunar");
        }else if(p.isVacunado()==true){
            System.out.println("¡Hay que estar aburrido para querer vacunarse 2 veces!");
        }else{
            p.vacunar();
            cola.remove(p);
            System.out.println("Otro vacunado");
        }
    }

    public boolean isColaVacia() {
        return colaVacia;
    }
    
    
    
    
}
