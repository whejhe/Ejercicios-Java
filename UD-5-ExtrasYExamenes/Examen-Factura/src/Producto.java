
import java.util.Objects;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Objects;

public class Producto implements Comparable{

    private String categoria;
    private String nombre;
    private double precio;

    public Producto(String categoria, String nombre, double precio) {
        if (nombre == null || categoria == null) {
            throw new NullPointerException("Ni categoria ni nombre pueden ser nulos");
        }
        if (nombre.equals("") || categoria.equals("")) {
            throw new IllegalArgumentException("Ni categoria ni nombre pueden ser una cadena vacia");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio no puede ser igual o menor que 0");
        }
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.categoria);
        hash = 89 * hash + Objects.hashCode(this.nombre);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    
    
    public int compareTo(Object o) {
        // Primero se compara por categoría ascendente
        Producto p = (Producto)o;
        int result = this.categoria.compareTo(p.getCategoria());
        //int result = p.getCategoria().compareTo(this.categoria);Descendente
        
        // Si las categorías son iguales, se compara por precio descendente
        if (result == 0) {
            result = Double.compare(p.getPrecio(), this.precio);
            //result = Double.compare(this.precio, p.getPrecio());Ascendente
        }
        return result;
    }

}
