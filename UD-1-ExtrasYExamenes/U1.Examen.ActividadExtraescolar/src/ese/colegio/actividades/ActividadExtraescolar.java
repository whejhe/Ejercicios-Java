package ese.colegio.actividades;

public class ActividadExtraescolar {

    public String nombreActividad;
    public String nivelActividad;
    public int numPlazasOfertadas;
    public int numPlazasOcupadas;
    public double cuotaMensual;

    public void estableceNombreActividad(String nuevaActividad) {
        nombreActividad = nuevaActividad;
    }

    public void estableceNivelActividad(String nuevoNivel) {
        nivelActividad = nuevoNivel;
    }

    public void estableceNumPlazasOfertadas(int numTotal) {
        numPlazasOfertadas = numTotal;
    }

    public void estableceCuotaMensual(double nuevaCuota) {
        cuotaMensual = nuevaCuota;
    }

    public String obtieneNombreActividad() {
        return nombreActividad;
    }

    public String obtieneNivelActividad() {
        return nivelActividad;
    }

    public int obtieneNumPlazasOfertadas() {
        return numPlazasOfertadas;
    }

    public int obtieneNumPlazasOcupadas() {
        return numPlazasOcupadas;
    }

    public double obtieneCuotaMensual() {
        return cuotaMensual;
    }

    public void daAlta() {
        numPlazasOcupadas++;
        numPlazasOfertadas--;
    }

    public void daBaja() {
        numPlazasOfertadas++;
        numPlazasOcupadas--;
    }

    public double calculaCuotaBonificada20() {
        final double bonificacion = (cuotaMensual / 100) * 20;
        return bonificacion;
    }

    public double calculaCuotaBonificada80() {
        final double bonificacion = (cuotaMensual / 100) * 80;
        return bonificacion;
    }
}
