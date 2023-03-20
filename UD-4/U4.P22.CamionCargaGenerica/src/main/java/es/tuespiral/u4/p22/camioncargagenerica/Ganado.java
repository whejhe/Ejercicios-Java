package es.tuespiral.u4.p22.camioncargagenerica;

public class Ganado implements Pesable{
    private double peso;
    
    public Ganado(double peso) {
        this.peso = peso;
    }
    
    @Override
    public double getPeso() {
        return peso;
    }
    
}