/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nuevoNumero;
        Set loteria = new HashSet();
        
            /*32458970
            61827309
            59718036
            98471520
            73860912
            14250896
            20987531
            36501287
            49870213
            82750396*/
        
        System.out.println("Dame los numeros premiados");
        do{
            nuevoNumero=sc.nextInt();
            loteria.add(nuevoNumero);
        }while(nuevoNumero!=-1);
        
        System.out.println("Dime el numero premiado");
        int premiado=sc.nextInt();
        if(loteria.contains(premiado)){
            System.out.println("Lotería Doña Paquita a vendido el Gordo de Navidad");
        }else{
            System.out.println("Este año no hemos tenido suerte");
        }
        
        
        
        
    }
}
