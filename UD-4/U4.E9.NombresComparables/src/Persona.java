/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Persona implements Comparable {

    private String nombre;
    private String dni;
    private int edad;
    
    public Persona(String nombre,String dni,int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "NOMBRE= " + nombre + " DNI= " + dni + " EDAD= " + edad;
    }

    @Override
    public int compareTo(Object obj) {
        Persona p =(Persona)obj;
        int result = nombre.compareTo(p.getNombre());
        if(result == 0){
            result = -(edad - p.getEdad());
        }
        return result;
    }
    
}
