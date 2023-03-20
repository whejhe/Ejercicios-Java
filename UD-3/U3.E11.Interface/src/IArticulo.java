/**
 *
 * @author Carlos Fernandez
 *@version 1.0
 */
public interface IArticulo {
    
    String getNombre();
    void setNombre(String nombre);
    double getPrecio();
    void setPrecio(double precio);
    
    // Artículo: nombre. Precio: precio €
    @Override
    String toString();
    
}
