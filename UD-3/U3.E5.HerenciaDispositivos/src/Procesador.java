/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Procesador extends Dispositivo{
    
    private int suma;
    private int resta;
    private int multiplicar;
    private int dividir;
    private int contador;
    private boolean encender;
    
    @Override
    public void encender(){
        encender=true;
    }
    
    @Override
    public void apagar(){
        encender=false;
    }
    
    @Override
    public boolean isEncender() {
        if(encender==false){
            System.out.println("Procesador apagado");
        }else{
            System.out.println("Procesador encendido");
        }
        return encender;
    }

    public int numOperaciones(){
        return contador;
    }

    public int getSuma() {
        if(encender==false){
            System.out.println("Error, procesador apagado");
        }else{
            contador++;
            return suma;
        }
        return 0;
    }

    public void setSuma(int num1,int num2) {
        suma = num1+num2;
    }

    public int getResta() {
        contador++;
        return resta;
    }

    public void setResta(int num1,int num2) {
        resta = num1-num2;
    }

    public int getMultiplicar() {
        contador++;
        return multiplicar;
    }

    public void setMultiplicar(int num1,int num2) {
        multiplicar = num1*num2;
    }

    public int getDividir() {
        contador++;
        return dividir;
    }

    public void setDividir(int num1,int num2) {
        dividir = num1/num2;
    }
    
    
    
}
