/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Apartamento {
    
    private String codigoPostal;
    private int numHabitaciones;
    private int numCamasDisponibles;
    private boolean apartOcupado;

    public Apartamento(String codigoPostal, int numHabitaciones, int numCamasDisponibles, boolean apartOcupado) {
        if(codigoPostal==null){
            throw new NullPointerException("El codigo postal no puede ser nulo");
        }
        if(numCamasDisponibles<0 || numCamasDisponibles>500){
            throw new IllegalArgumentException("El numero de camas no es coherente");
        }
        if(numHabitaciones<0 || numHabitaciones>500){
            throw new IllegalArgumentException("El numero de habitaciones no es coherente");
        }
        this.codigoPostal = codigoPostal;
        this.numHabitaciones = numHabitaciones;
        this.numCamasDisponibles = numCamasDisponibles;
        this.apartOcupado = apartOcupado;
    }
    
    public void ocupar(){
        if(apartOcupado==true){
            throw new IllegalStateException("La habitacion ya esta ocupada");
        }
        apartOcupado=true;
    }
    
    public void liberar(){
        if(apartOcupado==false){
            throw new IllegalStateException("La habitacion ya se encontraba libre");
        }
        apartOcupado=false;
    }
    
    
    
}
