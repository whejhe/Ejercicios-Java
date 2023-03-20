package ese.colegio.actividades;

public class ActividadExtraescolar {
    
    public String nombreActividad;
    public String nivelActividad;
    public int numPlazasOfertadas;
    public int numPlazasOcupadas;
    public double cuotaMensual;
    
    public void estableceNombreActividad(String nuevaActividad){
        nombreActividad=nuevaActividad;
    }
    public void estableceNivelActividad(String nuevoNivel){
        nivelActividad=nuevoNivel;
    }
    public void estableceNumPlazasOfertadas(int numTotal){
        numPlazasOfertadas=numTotal;
    }
    public void estableceCuotaMensual(double nuevaCuota){
        cuotaMensual=nuevaCuota;
    }
    public String obtieneNombreActividad(){
        return nombreActividad;
    }
    public String obtieneNivelActividad(){
        return nivelActividad;
    }
    public int obtieneNumPlazasOfertadas(){
        return numPlazasOfertadas;
    } 
    public int obtieneNumPlazasOcupadas(){
        return numPlazasOcupadas;
    }
    public double obtieneCuotaMensual(){
        return cuotaMensual;
    }
    public void daAlta(){
        numPlazasOcupadas++;
        numPlazasOfertadas--;
    }
    public void daBaja(){
        numPlazasOcupadas--;
        numPlazasOfertadas++;
    }
    public double calculaCuotaBonificada20(){
        final int bonificacion = 20;
        double resultado=cuotaMensual-(cuotaMensual*bonificacion)/100;
        return resultado;
    }
    public double calculaCuotaBonificada80(){
        final int bonificacion = 80;
        double resultado=cuotaMensual-(cuotaMensual*bonificacion)/100;
        return resultado;
    }
    
    
}
