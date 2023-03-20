/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class Cuentas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Dime el primer numero de la operacion");
        num1=sc.nextInt();
        System.out.println("Dime el segundo numero para laa operacion");
        num2=sc.nextInt();
        
        System.out.println("Escoge una operacion '+' '-' '*' '/'");
        String operacion=sc.next();
        double suma=num1+num2;
        double resta=num1-num2;
        double multi=num1*num2;
        double division=num1/num2;
        switch(operacion){
            case "+":
                System.out.println("La suma de "+num1+" y "+num2+" es = "+suma);
                break;
            case "-":
                System.out.println("La resta de "+num1+" y "+num2+" es = "+resta);
                break;
            case "*":
                System.out.println("La multiplicacion de "+num1+" por "+num2+" es = "+multi);
                break;
            case "/":
                System.out.println("La division de "+num1+" entre "+num2+" es = "+division);
                break;
            default:
                System.out.println("Operacion no contemmplada");
                break;
        }
        
        
    }
               
}
