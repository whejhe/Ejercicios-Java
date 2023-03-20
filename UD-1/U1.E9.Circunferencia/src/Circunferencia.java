public class Circunferencia {
    
    public double radio;
    
    public void estableceRadio(double nuevoRadio){
        radio=nuevoRadio;
    }
    public double calculaPerimetro(){
        double perimetro=Math.PI*((radio)*2);
        return perimetro;
    }
    public double calculaSuperficie(){
        double superficie;
        return superficie=Math.PI*(Math.pow(radio, 2));
    }
}
