package mi.tienda;

import java.util.Scanner;
import mi.tienda.juguetes.Juguete;

public class PruebaJuguete {
    public static void main(String[] args) {
        
        Juguete j = new Juguete();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que juguete quieres?");
        j.estableceNombreJuguete(sc.nextLine());
        System.out.println("¿Cual es la edad Recomendada?");
        j.estableceEdadJuguete(sc.next());
        System.out.println("¿Que precio tiene?");
        j.establecePrecioJuguete(sc.nextDouble());
        System.out.println("¿Cual es el stock actual?");
        j.estableceStock(sc.nextInt());
        
        System.out.println("");
        
        j.compra(1);
        j.compra(2);
        j.compra(3);
        j.compra(4);
        j.devuelve(3);
        
        System.out.println("Producto: "+j.obtieneNombreJuguete());
        System.out.println("Edad recomendada: "+j.obtieneEdadJuguete()+"años");
        System.out.println("Precio Unidad: "+j.obtienePrecioJuguete()+" €");
        System.out.println("Stock Actual: "+j.obtieneStock()+" Unidades");
        System.out.println("Precio con ticket descuento: "+j.calculaPrecioRebajado25()+" €");
        System.out.println("Producto en oferta por: "+j.calculaPrecioRebajado40()+"€");
    }
}
