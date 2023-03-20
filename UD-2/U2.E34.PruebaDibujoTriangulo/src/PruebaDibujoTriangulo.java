/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaDibujoTriangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tamTriangulo;
        String a = "*";
        
        do{
            System.out.println("Dime el tamaño del triangulo (5-30)");
            tamTriangulo=sc.nextInt();
            if(tamTriangulo<5 || tamTriangulo>30){
                System.out.println("Entre 5 y 30, prueba otra vez:");
            }
        }while(tamTriangulo<5 || tamTriangulo>30);
        /*---------------------------------------------------------------------*/
        
        for(int i=0;i<tamTriangulo;i++){
            System.out.println(a);
            a=a+"*";
        }
        
        /*for(int i=0;i<tamTriangulo;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
        
        
        
    }
}
