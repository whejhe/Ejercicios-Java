/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Pruebas {
    public static void main(String[] args) {
        
        Moneda euro = new Moneda("Euro","€");
        Moneda dolar = new Moneda("Dolar","$");
        Moneda francos = new Moneda("Francos Suizos","Fr");
        Dinero tv = new Dinero(300.50,euro);
        Dinero tablet = new Dinero(-128.99,dolar);
        Dinero reloj = new Dinero(12.78,francos);
        
        System.out.println("TABLET");
        System.out.println("Precio: "+tablet.toString()+tablet.getMoneda().toString());
        
        System.out.println("");
        
        System.out.println("TV");
        System.out.println("Precio: "+tv.toString()+tv.getMoneda().toString());
        
        System.out.println("");
        
        System.out.println("RELOJ");
        System.out.println("Precio: "+reloj.toString()+reloj.getMoneda().toString());
        
        
        
    }
}
