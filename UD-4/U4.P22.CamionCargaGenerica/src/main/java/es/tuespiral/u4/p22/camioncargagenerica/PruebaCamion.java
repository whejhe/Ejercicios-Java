package es.tuespiral.u4.p22.camioncargagenerica;

public class PruebaCamion {
    public static void main(String[] args) {
        Camion<Ganado> camGanado = new Camion<>();
        Camion<Madera> camMadera = new Camion<>();
        
        Ganado ganado = new Ganado(2000);
        Madera madera = new Madera(5000);
        
        camGanado.carga(ganado);
        camMadera.carga(madera);
        
        System.out.println("El camión de ganado lleva "+camGanado.getKilosCarga()+" kilos");
        System.out.println("El camión de madera lleva "+camMadera.getKilosCarga()+" kilos");
    }
}

