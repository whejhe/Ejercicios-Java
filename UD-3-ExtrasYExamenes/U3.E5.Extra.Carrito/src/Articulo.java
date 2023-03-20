/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Articulo {
    
    private int codArticulo;
    private String nombre;
    private String marca;
    private double precio;

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codArticulo=" + codArticulo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
    
    
}
