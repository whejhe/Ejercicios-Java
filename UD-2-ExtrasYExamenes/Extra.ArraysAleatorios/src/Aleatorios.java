/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Aleatorios {
    
    public static void main(String[] args) {
        
        int[] aleatorio=new int[100];
        int total=0;
        
        for(int i=0;i<aleatorio.length;i++){   
            aleatorio[i]=(int)(Math.random()*-1000-1);
            total=total+aleatorio[i];
            System.out.print(aleatorio[i]+"/");
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos del array es "+total);
        
    }
    
    
}
