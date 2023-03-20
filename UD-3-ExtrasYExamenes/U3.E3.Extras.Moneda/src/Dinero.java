/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Dinero {
    
    private double cantidad;
    private Moneda moneda;
    
    public Dinero(double cantidad,Moneda moneda){
        if(cantidad<0){
            cantidad=cantidad*-1;
            System.out.println("Aviso: El resultado puede no ser real");
        }
        this.cantidad=cantidad;
        this.moneda=moneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    @Override
    public String toString() {
        return "" + cantidad;
    }

    
    
}
