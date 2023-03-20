/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaColaPacientes {
    public static void main(String[] args) {
        
        ColaPacientes c = new ColaPacientes();
        Paciente p1 = new Paciente("Juan",false);
        Paciente p2 = new Paciente("Ana",false);
        Paciente p3 = new Paciente("Manuel",false);
        Paciente p4 = new Paciente("Sandra",true);
        
        c.agregaPaciente(p1);
        c.agregaPaciente(p2);
        c.agregaPaciente(p3);
        c.agregaPaciente(p4);
        
        c.vacunaSiguientePaciente(p1);
        c.vacunaSiguientePaciente(p2);
        c.vacunaSiguientePaciente(p3);
        c.vacunaSiguientePaciente(p4);
        
    }
}
