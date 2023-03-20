/**
 *
 * @author usuario
 */
public class Tarjeta {

    private int identificador;
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
        int hash = 5;
        hash = 79 * hash + this.identificador;
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
    
    
    
}
