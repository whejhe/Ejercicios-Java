package ese.colegio;

import ese.colegio.actividades.ActividadExtraescolar;

public class PruebaActividadExtraescolar {
    public static void main(String[] args) {
        
        ActividadExtraescolar a = new ActividadExtraescolar();
        
        a.estableceNombreActividad("Piano");
        a.estableceNivelActividad("Segundo");
        a.estableceCuotaMensual(100);
        a.estableceNumPlazasOfertadas(10);
        
        System.out.println("Actividad: "+a.obtieneNombreActividad());
        System.out.println("Nivel: "+a.obtieneNivelActividad());
        System.out.println("Cuota Mensual: "+a.obtieneCuotaMensual());
        System.out.println("Numero de plazas ofertadas "+a.obtieneNumPlazasOfertadas());
        
        a.daAlta();
        a.daAlta();
        a.daAlta();
        a.daAlta();
        a.daAlta();
        a.daBaja();
        
        System.out.println("");
        System.out.println("Numero de plazas ocupadas: "+a.obtieneNumPlazasOcupadas());
        System.out.println("Plazas libres: "+a.obtieneNumPlazasOfertadas());
        System.out.println("Couta reducida: "+a.calculaCuotaBonificada20());
        System.out.println("Couta superReducida: "+a.calculaCuotaBonificada80());
                
    }
}
