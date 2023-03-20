package mi.tienda.juguetes;

public class Juguete {
    
    public String nombreJuguete;
    public String edadJuguete;
    public double precioJuguete;
    public int stock;
    
    public void estableceNombreJuguete(String nuevoJuguete){
        nombreJuguete=nuevoJuguete;
    }
    public void estableceEdadJuguete(String nuevaEdad){
        edadJuguete=nuevaEdad;
    }
    public void establecePrecioJuguete(double nuevaCuota){
        precioJuguete=nuevaCuota;
    }
    public void estableceStock(int numTotal){
        stock=numTotal;
    }
    public String obtieneNombreJuguete(){
        return nombreJuguete;
    }
    public String obtieneEdadJuguete(){
        return edadJuguete;
    }
    public double obtienePrecioJuguete(){
        return precioJuguete;
    }
    public int obtieneStock(){
        return stock;
    }
    public double compra(int cantidad){
        stock -=cantidad;
        double precio=precioJuguete*cantidad;
        return precio;
    }
    public double devuelve(int cantidad){
        stock +=cantidad;
        double vuelta=precioJuguete*cantidad;
        return vuelta;
    }
    public double calculaPrecioRebajado25(){
        final int porcentaje=25;
        double rebaja=precioJuguete-(precioJuguete*porcentaje)/100;
        return rebaja;
    }
    public double calculaPrecioRebajado40(){
        final int porcentaje=40;
        double rebaja=precioJuguete-(precioJuguete*porcentaje)/100;
        return rebaja;
    }
    
}
