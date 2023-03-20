/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class memoria extends Dispositivo{
    
    private final int TAM = 100;
    private int[] ram = new int[TAM];
    private int numLecturas,numEscrituras;
    
    @Override
    public void apagar(){
        super.apagar();
        ram = new int[TAM];
    }
    
    public void setPosicion(int pos,int num){
        if(isEncendido()){
            if(pos>TAM){
                System.out.println("Error, posicion fuera de rango");
            }else{
                numEscrituras++;
                ram[pos]=num;
            }
        }else{
            error();
        }
        
    }
    
    public void getPosicion(int pos){
        if(isEncendido()){
            numLecturas++;
            System.out.println("La posicion "+pos+" esta ocupada por el nº "+ram[pos]);
        }else{
            error();
        }
    }
    
    public void resumen(){
        System.out.println("Numero de Escrituras: "+numEscrituras);
        System.out.println("Numero de Lecturas: "+numLecturas);
    }
}
