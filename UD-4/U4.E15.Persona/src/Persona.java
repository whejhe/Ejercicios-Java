
import java.util.Objects;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Persona {
    
    private String dni,nombre,apellidos,telefono,direccion;
    private int edad;
    private boolean estaCasado,tieneTrabajo;

    public Persona(String dni, String nombre, String apellidos, String telefono, String direccion, int edad, boolean estaCasado, boolean tieneTrabajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.estaCasado = estaCasado;
        this.tieneTrabajo = tieneTrabajo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", edad=" + edad + ", estaCasado=" + estaCasado + ", tieneTrabajo=" + tieneTrabajo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.tieneTrabajo ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.tieneTrabajo == other.tieneTrabajo;
    }

   
    
    
}
