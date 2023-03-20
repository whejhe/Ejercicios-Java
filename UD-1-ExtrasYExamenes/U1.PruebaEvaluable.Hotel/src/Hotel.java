public class Hotel {
    public int numTotalHabitaciones;
    public int numHabitacionesOcupadas;
    public double precioHabitacionDiario;
    public double suplementoPrecioTemporadaAlta;
    public boolean temporadaAlta;
    
    public void estableceNumTotalHabitaciones(int numTotal){
        numTotalHabitaciones=numTotal;
    }
    public void establecePrecioHabitacionDiario(double nuevoPrecio){
        precioHabitacionDiario=nuevoPrecio;
    }
    public void estableceSuplementoPrecioTemporadaAlta(double nuevoIncremento){
        suplementoPrecioTemporadaAlta=nuevoIncremento;
    }
    public int obtieneNumHabitacionesOcupadas(){
        return numHabitacionesOcupadas;
    }
    public int obtieneNumTotalHabitaciones(){
        return numTotalHabitaciones;
    }
    public void ocupaUnaHabitacion(){
         numHabitacionesOcupadas++;
    }
    public void liberaUnaHabitacion(){
         numHabitacionesOcupadas--;
    }
    public void comienzaTemporadaAlta(){
        temporadaAlta=true;
        precioHabitacionDiario=precioHabitacionDiario+suplementoPrecioTemporadaAlta;
    }
    public void finalizaTemporadaAlta(){
        temporadaAlta=false;
        precioHabitacionDiario=precioHabitacionDiario-suplementoPrecioTemporadaAlta;
    }
    public double calculaBeneficioDiario(){
        double importeTotal=precioHabitacionDiario*numHabitacionesOcupadas;
        return importeTotal;
    }
    
}
