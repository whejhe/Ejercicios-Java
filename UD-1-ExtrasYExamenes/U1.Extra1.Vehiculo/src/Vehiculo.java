public class Vehiculo {
    
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public double consumoPor100Km;
    public boolean arrancado;
    public double kmRecorridos;
    
    
    public void setNumRuedas(int nuevoNumRuedas){//setter
        numRuedas=nuevoNumRuedas;
    }
    public void setPotencia(double nuevaPotencia){//setter
        potencia=nuevaPotencia;
    }
    public void setConsumoPor100Km(double nuevoConsumoPor100Km){//setter
        consumoPor100Km=nuevoConsumoPor100Km;
    }
    public void reponerCombustible(double numLitrosRepuestos){
        litrosEnDeposito=litrosEnDeposito+numLitrosRepuestos;
    }
    public void recorrerDistancia(double numKm){
        litrosEnDeposito = litrosEnDeposito -(numKm*consumoPor100Km);
        kmRecorridos=+numKm;
    }
    public void arrancar(){
        arrancado=true;
    }
    public void apagar(){
        arrancado=false;
    }
    public int getNumRuedas(){
        return numRuedas;
    }
    public double getPotencia(){
        return potencia;
    }
    public double getConsumoPor100Km(){
        return consumoPor100Km;
    }
    public double getLitrosEnDeposito(){
        return litrosEnDeposito;
    }
    public double calculaPorcentajeDesgaste(){
        double desgaste=(kmRecorridos*100)/20000;
        return desgaste;
    }
}
