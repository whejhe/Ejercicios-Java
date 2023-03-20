/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public abstract class Calentadores {
    
    protected double potenciaMax;
    protected boolean encendido;


    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    public boolean isEncendido() {
        return encendido;
    }
    
    public void encender(){
        encendido=true;
    }
    
    public void apagar(){
        encendido=false;
    }
    
    public double calculaPotenciaActual(){
        if(encendido==false){
            return 0;
        }else{
            return potenciaMax;
        }
    }
    
}
