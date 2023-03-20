/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Paciente {
    
    private String nombre;
    private boolean vacunado;

    public Paciente(String nombre, boolean vacunado) {
        this.nombre = nombre;
        this.vacunado = vacunado;
    }

    public boolean isVacunado() {
        return vacunado;
    }
    
    public void vacunar() throws PacienteVacunadoException{
        if(isVacunado()==true){
            throw new PacienteVacunadoException("El paciente ya esta vacunado");
        }else{
            vacunado=true; 
        }   
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
