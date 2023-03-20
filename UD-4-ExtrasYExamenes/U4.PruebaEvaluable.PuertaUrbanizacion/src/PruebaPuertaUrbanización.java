/**
 *
 * @author Carlos Fernandez 
 * @version 1.0
 */
public class PruebaPuertaUrbanización {
    public static void main(String[] args) {
        
        PuertaUrbanizacion p = new PuertaUrbanizacion();
        Tarjeta t = new Tarjeta(1,"Juan");
        Tarjeta t2 = new Tarjeta(2,"Sara");
        Tarjeta t3 = new Tarjeta(3,"Antonio");
        Tarjeta t4 = new Tarjeta(4,"Violeta");
        
        p.agregaTarjetaPermitida(t);
        p.agregaTarjetaPermitida(t2);
        p.agregaTarjetaPermitida(t3);
        p.agregaTarjetaPermitida(t3);
        
        System.out.println("-----------------------------------------------");
        
        p.eliminarTarjetaPermitida(4);
        p.eliminarTarjetaPermitida(3);
        
        System.out.println("-----------------------------------------------");
        
        p.imprimeTarjetasPermitidas();
        
        System.out.println("------------------------------------------------");
        
        p.intentoDeEntrada(4);
        p.intentoDeEntrada(1);
        p.intentoDeEntrada(2);
        p.intentoDeEntrada(2);
        
        System.out.println("------------------------------------------------");
        
        p.intentoDeSalida(3);
        p.intentoDeSalida(1);
        p.intentoDeSalida(1);
        
        
        
    }
}
