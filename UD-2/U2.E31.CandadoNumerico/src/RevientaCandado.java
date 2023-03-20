/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class RevientaCandado {
    public static void main(String[] args) {
        
        CandadoNumerico c=new CandadoNumerico();
        Scanner sc =new Scanner(System.in);
        int numeroCandado;
        int contador=0;
        
        do{
            System.out.println("Establece un numero para tu candado entre 0 y 9999:");
            numeroCandado=sc.nextInt();
            c.setNumSecreto(numeroCandado);
            if(numeroCandado<0 || numeroCandado>9999){
                System.out.println("ERROR!!");
            }
        }while(numeroCandado<0 || numeroCandado>9999);
        /*---------------------------------------------------------------------*/
        
        /*for(int i=0;i<numeroCandado;i++){
            System.out.println("Probando con el nº "+contador+":no se abre");
            contador++;
        }
        System.out.println("Probando con el nº "+contador+":SE ABRIÓ");*/
        
        /*---------------------------------------------------------------------*/
        while(c.intentaAbrir(contador)!=true){
            System.out.println("Probando con el nº "+contador+":no se abre");
            contador++;
        }
        System.out.println("Probando con el nº "+contador+":SE ABRIÓ");
        
        
        
    }
}
