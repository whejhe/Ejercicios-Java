/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Carrito {
    
    private Articulo[] a1;
    private int numArticulos=0;

    public Carrito(Articulo a) {
       a1=new Articulo[10];
    }
    
    
    public void agregarArticulo(Articulo a){
        a1[numArticulos]=a;
        numArticulos++;
    }
    
    public double calcularPrecioTotal(){
        double total=0;
        for(int i=0;i<a1.length;i++){
            total=total+a1[i].getPrecio();
        }
        return total;
    }
    
    public double mostrarCarrito(){
        for(int i=0;i<a1.length;i++){
            a1[i].toString();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Carrito:" + "a1=" + a1 + ", numArticulos=" + numArticulos;
    }
    
    
    
    
}
