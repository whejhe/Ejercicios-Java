/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Articulo {
    
    public int idArticulo;
    public String nombre;
    public double precio;
    public static final Articulo NOT_FOUND = new Articulo();

    public int getIdArticulo() {
        return idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static Articulo getNOT_FOUND() {
        return NOT_FOUND;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
