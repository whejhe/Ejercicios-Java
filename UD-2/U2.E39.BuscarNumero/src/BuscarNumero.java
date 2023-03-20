/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] posiciones = new int[2000];
        int numBuscado;
        int contador=0;
        
        System.out.println("Dime que numero quieres buscar entre 0 y 1000");
        numBuscado=sc.nextInt();
        
        while(numBuscado<0 || numBuscado>1000){
            System.out.println("El nº debe estar entre 0 y 1000, prueba otra vez:");
            numBuscado=sc.nextInt();
        }
        
        for(int i=0;i<posiciones.length;i++){
            posiciones[i]=(int)(Math.random()*1000+1);
            if(posiciones[i]==numBuscado){
                contador++;
                System.out.println("Se ha encontrado el nº en la posicion "+(i-1));
                System.out.println("El nº era "+posiciones[i]);
                System.out.println("Encontrado por "+contador+"ª veces");
            }else{
                //System.out.println("Nº no encontrado");
            }
        }
        System.out.println("Encontrado "+contador+" veces");
        
        
        
        
    }
}
