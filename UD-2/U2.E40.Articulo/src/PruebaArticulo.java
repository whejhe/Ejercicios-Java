/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaArticulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Articulo[] misArticulos = new Articulo[5];
        int option;
        
        misArticulos[0] = new Articulo();
        misArticulos[0].setIdArticulo(1);
        misArticulos[0].setNombre("SSD");
        misArticulos[0].setPrecio(28.95);
        
        misArticulos[1] = new Articulo();
        misArticulos[1].setIdArticulo(2);
        misArticulos[1].setNombre("Fuente de Alimentacion");
        misArticulos[1].setPrecio(40.50);
        
        misArticulos[2] = new Articulo();
        misArticulos[2].setIdArticulo(3);
        misArticulos[2].setNombre("Tarjeta Grafica");
        misArticulos[2].setPrecio(298.99);
        
        misArticulos[3] = new Articulo();
        misArticulos[3].setIdArticulo(4);
        misArticulos[3].setNombre("Raton");
        misArticulos[3].setPrecio(19.99);
        
        misArticulos[4] = new Articulo();
        misArticulos[4].setIdArticulo(5);
        misArticulos[4].setNombre("Monitor");
        misArticulos[4].setPrecio(60.25);
        
        System.out.println("Dime que numero deseas buscar (id Articulo):");
        option=sc.nextInt()-1;
        
        while(option<1 || option>misArticulos.length){
            System.out.println("Solo tenemos "+misArticulos.length+" articulos registrados, prueba otra vez:");
            option=sc.nextInt()-1;
        }
        
        for(int i=0;i<misArticulos.length;i++){
            if(i==option){
                System.out.println("ID Articulo: "+misArticulos[i].getIdArticulo());
                System.out.println("Nombre: "+misArticulos[i].getNombre());
                System.out.println("Precio: "+misArticulos[i].getPrecio());
            }else{
                System.out.println("Articulo no encontrado");
            }
        }
        
    }
}
