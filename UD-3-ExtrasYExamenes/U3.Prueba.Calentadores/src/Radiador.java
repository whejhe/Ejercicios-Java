/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Radiador extends Calentadores {

    public void porcentajePotencia(double Potencia) {
        if(encendido==false){
            potenciaMax=0;
            System.out.println("Radiador apagado");
        }else{
            potenciaMax=(potenciaMax*Potencia)/100;
        }
    }
   
    @Override
    public double getPotenciaMax() {
        return potenciaMax;
    }
   
    @Override
    public double calculaPotenciaActual(){
        if(encendido==false){
            return 0;
        }else{
            return potenciaMax;
        }
    }
    
}
