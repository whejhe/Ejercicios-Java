public class Vehiculo {
    
    public int numRuedas;
    public double potencia;
    private double litrosEnDeposito;
    public double consumoPorKm;
    public boolean arrancado;
    public double kmRecorridos;
    
    
    public void setNumRuedas(int nuevoNumRuedas){//setter
        numRuedas=nuevoNumRuedas;
    }
    public void setPotencia(double nuevaPotencia){//setter
        potencia=nuevaPotencia;
    }
    public void setConsumoPorKm(double nuevoConsumoPorKm){//setter
        consumoPorKm=nuevoConsumoPorKm;
    }
    public void reponerCombustible(double numLitrosRepuestos){
        litrosEnDeposito=litrosEnDeposito+numLitrosRepuestos;
    }
    public void recorrerDistancia(double numKm){
        litrosEnDeposito=litrosEnDeposito-(consumoPorKm*numKm);
        kmRecorridos=consumoPorKm*numKm;
    }
    public void arrancar(){
        arrancado=true;
    }
    public void apagar(){
        arrancado=false;
    }
    public void imprimeNumRuedas(){
        System.out.println("El vehiculo tiene "+numRuedas+" ruedas");
    }
    public void imprimePotencia(){
        System.out.println("Tiene un potencia de "+potencia);
    }
    public void imprimeAutonomiaEnKm(){
        double puedeRecorrer=litrosEnDeposito/consumoPorKm;
        System.out.println("El vehículo consume "+consumoPorKm+
                " litros/km, tiene "+litrosEnDeposito+" litros en el depósito, así que puede recorrer "
                        +puedeRecorrer+ " km.");
    }
    public void imprimeLitrosEnDeposito(){
        System.out.println("Litros en deposito: "+litrosEnDeposito);
    }
    public void imprimeKmRecorridos(){
        System.out.println("Kilómetros recorridos: "+kmRecorridos);
    }
}
