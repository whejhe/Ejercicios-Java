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
    
    public boolean vacunar(){
        if(vacunado==true){
            return false;
        }else{
            vacunado=true;
            return true;
        }
    }
    
    
}
