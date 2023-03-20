
import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Persona implements Comparable {

    private String dni;
    private double rentaAnual;

    public Persona(String dni, double rentaAnual) {
        this.dni = dni;
        this.rentaAnual = rentaAnual;
    }

    public String getDni() {
        return dni;
    }

    public double getRentaAnual() {
        return rentaAnual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.dni);
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
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public int compareTo(Object o) {
        Persona a = (Persona) o;
        int resultado = (int) -(this.rentaAnual - a.getRentaAnual());
        return resultado;
    }

}
