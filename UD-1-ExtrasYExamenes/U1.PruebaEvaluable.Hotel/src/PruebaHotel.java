public class PruebaHotel {
    public static void main(String[] args) {
        
        Hotel Casablanca = new Hotel();
        
        Casablanca.estableceNumTotalHabitaciones(20);
        Casablanca.establecePrecioHabitacionDiario(50);
        Casablanca.estableceSuplementoPrecioTemporadaAlta(25);
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        
        System.out.println("El hotel tiene un total de "+Casablanca.obtieneNumTotalHabitaciones()+" habitaciones");
        System.out.println("Actualmente solo tiene ocupadas "+Casablanca.obtieneNumHabitacionesOcupadas()+" habitaciones");
        System.out.println("Con unos beneficios diarios de "+Casablanca.calculaBeneficioDiario()+" €");
        
        Casablanca.comienzaTemporadaAlta();
        System.out.println("Comienza la Temporada Alta");
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        Casablanca.ocupaUnaHabitacion();
        
        System.out.println("");
        System.out.println("Actualmente tiene ocupadas "+Casablanca.obtieneNumHabitacionesOcupadas()+" habitaciones");
        System.out.println("Con unos beneficios diarios de "+Casablanca.calculaBeneficioDiario()+" €");
        
        Casablanca.finalizaTemporadaAlta();
        System.out.println("Fin de la temporada");
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        Casablanca.liberaUnaHabitacion();
        
        System.out.println("");
        System.out.println("Actualmente tiene ocupadas "+Casablanca.obtieneNumHabitacionesOcupadas()+" habitaciones");
        System.out.println("Con unos beneficios diarios de "+Casablanca.calculaBeneficioDiario()+" €");
        /*double BeneficioDiario=Casablanca.calculaBeneficioDiario();
        System.out.println("Con unos beneficios diarios de "+BeneficioDiario+" €");*/
        
    }
}
