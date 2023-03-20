
import java.util.Objects;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Alumno implements Comparable {
    
    private String dni;
    private int edad,notaAcceso;

    public Alumno(String dni, int edad, int notaAcceso) {
        this.dni = dni;
        this.edad = edad;
        this.notaAcceso = notaAcceso;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getNotaAcceso() {
        return notaAcceso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", edad=" + edad + ", notaAcceso=" + notaAcceso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.dni);
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
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno)o;
        int resultado=(int)-(this.notaAcceso - a.getNotaAcceso());
        if(resultado!=0){
            resultado = this.edad - a.getEdad();
        }
        return resultado;
    }
    
}
