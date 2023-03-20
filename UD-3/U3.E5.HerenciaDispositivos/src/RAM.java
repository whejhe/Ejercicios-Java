/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class RAM extends Dispositivo{
    
    Scanner sc = new Scanner(System.in);
    
    private int[] memoria = new int[100];
    
    private int valor;
    private int lectura;
    private int escritura;
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
            System.out.println("RAM apagado");
        }else{
            System.out.println("RAM encendido");
        }
        return encender;
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void consultaMemoria(int posicion){
        for(int i=0;i<memoria.length;i++){
            if(memoria[i]==posicion){
                System.out.println("Posicion "+posicion+":"+memoria[i]);
                lectura++;
            }
        }
    }
    
    public void modificaPosicion(int posicion){     
        for(int i=0;i<memoria.length;i++){
            if(memoria[i]==posicion){
                System.out.println("Introduce el nuevo valor:");
                memoria[i]=sc.nextInt();
                escritura++;
            }
        }
    }
    
    public void numOperaciones(){
        System.out.println("Lecturas: "+lectura);
        System.out.println("Escritura: "+escritura);
    }
    
}
