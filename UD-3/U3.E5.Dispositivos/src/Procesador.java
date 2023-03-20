/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Procesador extends Dispositivo {
    
    private int numOperaciones;
    
    @Override
    public void apagar(){
        super.apagar();
        numOperaciones=0;
    }
    
    public int suma(int num1,int num2){
        if(isEncendido()){
            numOperaciones++;
            int suma=num1+num2;
            System.out.println(num1+"+"+num2+"="+suma);
            return suma;
        }else{
            error();
            return -1;
        }
    }
    
    public int resta(int num1,int num2){
        if(isEncendido()){
            numOperaciones++;
            int resta=num1-num2;
            System.out.println(num1+"-"+num2+"="+resta);
            return resta;
        }else{
            error();
            return -1;
        }
    }
    
    public int multiplicacion(int num1,int num2){
        if(isEncendido()){
            numOperaciones++;
            int multi=num1*num2;
            System.out.println(num1+"*"+num2+"="+multi);
            return multi;
        }else{
            error();
            return -1;
        }
    }
    
    public int dividir(int num1,int num2){
        if(isEncendido()){
            numOperaciones++;
            int division=num1/num2;
            System.out.println(num1+"/"+num2+"="+division);
            return division;
        }else{
            error();
            return -1;
        }
    }
    
    public void getNumOperaciones(){
        System.out.println("Se han realizado "+numOperaciones+" operaciones");
    }
}
