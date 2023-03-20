/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaPuertaUrbanización {
    
    public static void main(String[] args) {
        
        Tarjeta t = new Tarjeta(1,"Juan");
        Tarjeta t2 = new Tarjeta(2,"Maria");
        Tarjeta t3 = new Tarjeta(3,"Pedro");
        PuertaUrbanizacion p = new PuertaUrbanizacion();
        
        p.agregarTarjetaPermitida(t);
        p.agregarTarjetaPermitida(t2);
        p.agregarTarjetaPermitida(t3);
        p.eliminarTarjetaPermitida(3);
        
        p.imprimeTarjetasPermitidas();
        
        p.intentoDeEntrar(1);
        p.intentoDeEntrar(1);
        p.intentoDeEntrar(3);
        p.intentoDeSalida(1);
        p.intentoDeSalida(3);
        
    }
    
}
