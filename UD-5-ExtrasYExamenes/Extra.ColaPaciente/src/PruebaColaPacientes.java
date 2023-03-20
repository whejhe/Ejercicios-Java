
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaColaPacientes {

    public static void main(String[] args){

        
            ColaPaciente cp = new ColaPaciente();
            cp.agregaPaciente(new Paciente("Antonio", false));
            cp.agregaPaciente(new Paciente("Marta", false));
            cp.agregaPaciente(new Paciente("Sara", false));
            cp.agregaPaciente(new Paciente("Felipe", true));

        try{
            while (true) {
                cp.vacunaSiguientePaciente();
            }
        } catch (ColaVaciaException e) {
            System.out.println(e.getMessage());
        }

    }
}
