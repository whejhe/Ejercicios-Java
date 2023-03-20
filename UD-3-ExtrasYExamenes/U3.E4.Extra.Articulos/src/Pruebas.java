/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Pruebas {
    public static void main(String[] args) {
   
        Moneda m1 = new Moneda("Euro","€");
        Dinero d1 = new Dinero(30,m1);
        Dinero d2 = new Dinero(50,m1);
        Dinero d3 = new Dinero(25,m1);
        Articulo a1 = new Articulo(1,"Auriculares SONY FW22",d1);
        Articulo a2 = new Articulo(2,"Teclado Mehosy RT302",d2);
        Articulo a3 = new Articulo(3,"Raton inalámbrico Delta 3",d3);
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        System.out.println("");
        
        Dinero d4 = new Dinero(39,m1);
        a1.setPrecio(d4);
        System.out.println(a1);
        
        System.out.println("");

        Dinero d5 = new Dinero(-50,m1);
        a2.setPrecio(d5);
        System.out.println(a2);
    }
}
