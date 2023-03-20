/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaValidaEntrada {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        int mayorCero;
        int menorIgualCero;
        double realRango;
        String siNo;
        
        System.out.println("Introduce un numero entero mayor que 0");
        mayorCero=sc.nextInt();
        
        while(mayorCero<0){
            System.out.println("El número debe ser mayor que cero");
            System.out.println("Dime otro numero:");
            mayorCero=sc.nextInt(); 
        }
        /*-----------------------------------------------------------*/
        System.out.println("Introduce un numero menor o igual que 0");
        menorIgualCero=sc.nextInt();
        
        while(menorIgualCero>0){
            System.out.println("El número debe ser menor o igual que cero");
            System.out.println("Introduce otro numero:");
            menorIgualCero=sc.nextInt();
        }
        /*-----------------------------------------------------------*/
        System.out.println("Introduce un numero coomprendido entre 1.3 y 19.8");
        realRango=sc.nextDouble();
        
        while(realRango<1.3 || realRango>19.8){
            System.out.println("El número debe ser estar comprendido entre 1.3 y 19.8");
            System.out.println("Prueba otra vez:");
            realRango=sc.nextDouble();
        }
        /*---------------------------------------------------------------------*/
        System.out.println("Introduce un caracter 'S' o 'N' ");
        siNo=sc.next();
        
        while(!(siNo.equalsIgnoreCase("S")|| siNo.equalsIgnoreCase("N"))){
            System.out.println("El caracter solo puede ser S o N");
            System.out.println("Pueba otra vez:");
            siNo=sc.next();
        }
        /*----------------------------------------------------------------------*/
        System.out.println("MayorCero: "+mayorCero);
        System.out.println("MenorIgualCero: "+menorIgualCero);
        System.out.println("RealRango: "+realRango);
        System.out.println("siNo: "+siNo);
        
    }
}
