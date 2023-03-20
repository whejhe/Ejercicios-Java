
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Persona implements Comparable {

    private int edad;
    private String nombre;
    private String apellido;
    private boolean conTrabajo;
    static int valor;

    public Persona(int edad, String nombre, String apellido, boolean conTrabajo) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.conTrabajo = conTrabajo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isConTrabajo() {
        return conTrabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", conTrabajo=" + conTrabajo+"\n";
    }

    @Override
    public int compareTo(Object obj) {
        Persona p = (Persona) obj;
        switch (valor) {
            case 1 -> {
                int resultado =(int)(this.edad -p.getEdad());
                return resultado;
            }
            case 2 -> {
                int resultado =(int)(p.getEdad() -this.edad);
                return resultado;
            }
            case 3 -> {
                return - (this.nombre.compareTo(p.getNombre()));
            }
            case 4 -> {
                return - (this.apellido.compareTo(p.getApellido()));
            }
            case 5 -> {
                int value;
                if(conTrabajo==true){
                    value=1;
                    return value;
                }else{
                    value=0;
                    return value;
                }
            }
            default -> {
                //Falta booleano
                return -1;
            }
        }
        
    }

}
