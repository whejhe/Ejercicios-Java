/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Articulo implements Comparable {

    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    @Override
    public int compareTo(Object o) {
        Articulo a =(Articulo)o;
        if(this.precio<a.getPrecio()){
            return -1;
        }else if(this.precio>a.getPrecio()){
            return 1;
        }else{
            return 0;
        }
    }
    
    
    
    
    
}
