
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
//import java.util.Scanner;

public class PruebaCarrito {
    public static void main(String[] args) {
        
        //Scanner sc = new Scanner(System.in);
        Carrito carro = new Carrito();
        
        //Creamos articulos
        Articulo lego = new Articulo();
        lego.setIdArticulo(1);
        lego.setNombre("Barco");
        lego.setPrecio(25.0);
        
        Articulo JuegoMesa = new Articulo();
        JuegoMesa.setIdArticulo(2);
        JuegoMesa.setNombre("Risk");
        JuegoMesa.setPrecio(50.0);
        
        Articulo peluche = new Articulo();
        peluche.setIdArticulo(3);
        peluche.setNombre("Osito");
        peluche.setPrecio(10.0);
        
        //Guardamos articulos en el carro
        carro.inicializaCarrito(5);//Tamaño de la Array
        carro.guardaArticulo(lego);
        carro.guardaArticulo(JuegoMesa);
        carro.guardaArticulo(peluche);
        
        carro.muestraArticulos();
        //carro.buscaArticuloPorId(3);
        
        System.out.println("Precio Total="+carro.getPrecioTotalCarrito());
        
        
        
    }
}
