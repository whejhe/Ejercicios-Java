/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Secador extends Calentadores{
    
    private boolean resistencia1;
    private boolean resistencia2;
    
    
    public void encenderResistencia1(){
        resistencia1=true;
    }
    
    public void encenderResistencia2(){
        resistencia2=true;
    }
    
    public void apagarResistencia1(){
        resistencia1=false;
    }
    
    public void apagarResistencia2(){
        resistencia2=false;
    }
    
    public void estadoResistencia(){
        if(resistencia1==true && resistencia2==true){
            System.out.println("Ambas resistencias encendidas");
        }else if(resistencia1==true && resistencia2==false){
            System.out.println("Resistencia 1 encendida");
        }else if(resistencia1==false && resistencia2==true){
            System.out.println("Resistencia 2 encendida");
        }else{
            System.out.println("Ambas resistencias apagadas");
        }
    }
    
    public double getPotenciaActual(){
        if(encendido==true && resistencia1==true && resistencia2==true){
            return potenciaMax;
        }else if(encendido==true && (resistencia1==true || resistencia2==true)){
            return potenciaMax/2;
        }else if(resistencia1==false && resistencia2==false && encendido==true){
            return potenciaMax=0;
        }else{
            return 0;
        }
    }
    
}
