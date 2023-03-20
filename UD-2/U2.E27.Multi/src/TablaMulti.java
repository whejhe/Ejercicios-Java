/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class TablaMulti {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int tablaMulti;
        int por=0;
        
        System.out.println("Dime que tabla quieres que muestre");
        tablaMulti=sc.nextInt();
        
        while(por<=10){
            System.out.println(tablaMulti+"x"+por+" = "+tablaMulti*por);
            por++;
        }
        
    }
}
