public class DepositoCircular {
    
    public double radio;
    public double altura;
    public double litrosRiegoHora;
    public double numLitrosActual;

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public double getLitrosRiegoHora() {
        return litrosRiegoHora;
    }

    public double getNumLitrosActual() {
        return numLitrosActual;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLitrosRiegoHora(double litrosRiegoHora) {
        this.litrosRiegoHora = litrosRiegoHora;
    }
    
    public double calculaSuperficieBase(){
        double Superficie=Math.PI*(Math.pow(radio, 2));
        return Superficie;
    }
    public double calculaPerimetroBase(){
        double Perimetro=2*Math.PI*radio;
        return Perimetro;
    }
    public double calculaCapacidad(){
        double Capacidad=Math.PI*(Math.pow(radio, 2))*altura;
        //double Capacidad=calculaSuperficieBase()*altura;
        return Capacidad;
    }
    public void cargaDeposito(double numLitros){
        numLitrosActual=numLitrosActual+numLitros;
    }
    public void riega(double numMinutos){
        numLitrosActual=numLitrosActual-(numMinutos*litrosRiegoHora);
    }
}
