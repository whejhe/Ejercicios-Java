public class PruebaVehiculo {
    public static void main(String[] args) {
        
        Vehiculo Renault = new Vehiculo();
        
        Renault.setNumRuedas(4);
        Renault.setPotencia(100);
        Renault.setConsumoPorKm(0.12);
        Renault.imprimeNumRuedas();
        Renault.imprimePotencia();
        Renault.reponerCombustible(30);
        Renault.imprimeLitrosEnDeposito();
        Renault.imprimeAutonomiaEnKm();
        System.out.println("");
        
        Renault.arrancar();
        Renault.recorrerDistancia(120);
        Renault.imprimeLitrosEnDeposito();
        Renault.imprimeAutonomiaEnKm();
        Renault.apagar();
        System.out.println(""); 
        
        Renault.reponerCombustible(10);
        Renault.imprimeLitrosEnDeposito();
        Renault.imprimeAutonomiaEnKm();
        
        
        
    }
}
