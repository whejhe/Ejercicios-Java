/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Tarjeta {
    
    private final int identificador;
    private String nombrePropietario;

    public Tarjeta(int identificador, String nombrePropietario) {
        this.identificador = identificador;
        this.nombrePropietario = nombrePropietario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.identificador;
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
        final Tarjeta other = (Tarjeta) obj;
        return this.identificador == other.identificador;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "identificador=" + identificador + ", nombrePropietario=" + nombrePropietario + '}';
    }
    
    
    
}
