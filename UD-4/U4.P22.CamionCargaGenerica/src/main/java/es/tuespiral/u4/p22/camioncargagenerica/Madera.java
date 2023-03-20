package es.tuespiral.u4.p22.camioncargagenerica;

public class Madera implements Pesable{
    private double peso;
    
    public Madera(double peso) {
        this.peso = peso;
    }
    
    @Override
    public double getPeso() {
        return peso;
    }
    
}
