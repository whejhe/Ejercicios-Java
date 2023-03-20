/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaCarrito {
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo();
        a1.setCodArticulo(1);
        a1.setNombre("TV");
        a1.setMarca("Phillips");
        a1.setPrecio(50);
        
        Articulo a2 = new Articulo();
        a1.setCodArticulo(2);
        a1.setNombre("TV");
        a1.setMarca("Phillips");
        a1.setPrecio(50);
        
        Articulo a3 = new Articulo();
        a1.setCodArticulo(3);
        a1.setNombre("TV");
        a1.setMarca("Phillips");
        a1.setPrecio(50);
        
        Articulo a4 = new Articulo();
        a1.setCodArticulo(4);
        a1.setNombre("TV");
        a1.setMarca("Phillips");
        a1.setPrecio(50);
        
        Articulo a5 = new Articulo();
        a1.setCodArticulo(5);
        a1.setNombre("TV");
        a1.setMarca("Phillips");
        a1.setPrecio(50);
        
        Carrito c1 = new Carrito(a1);
        c1.agregarArticulo(a2);
        c1.agregarArticulo(a3);
        c1.agregarArticulo(a4);
        c1.agregarArticulo(a5);
        
        System.out.println(c1.toString());
        
    }
}
