/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaArticulos {
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("",19.99);
        Articulo a2 = new Articulo("",14.99);
        Articulo a3 = new Articulo("",5.99);
        
        Articulos a = new Articulos();
        
        a.agregarArticulo(a1);
        a.agregarArticulo(a2);
        a.agregarArticulo(a3);
        
        a.imprimeArticulos();
        a.ordenaArticulos();
        a.imprimeArticulos();
        
        a.calculaTotalArticulo();
        
        System.out.println("¿Contiene el Articulo? "+a.contieneArticulo(a1));
        if(a.contieneArticulo(a1)==true){
            a.borraArticulo(a1);
        }
        
        a.imprimeArticulos();
        
        
    }
}
