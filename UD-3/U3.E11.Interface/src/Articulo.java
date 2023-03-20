/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Articulo implements IArticulo{
    
    private String Nombre;
    private double Precio;

    public Articulo(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    
    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.Nombre=nombre;
    }

    @Override
    public double getPrecio() {
        return Precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.Precio=precio;
    }

    @Override
    public String toString() {
        return "Articulo: "+ Nombre + ". Precio: " + Precio+"€";
    }

    
}
