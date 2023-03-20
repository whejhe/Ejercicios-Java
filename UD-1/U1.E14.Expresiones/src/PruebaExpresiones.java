
import java.util.Scanner;

public class PruebaExpresiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el número a");
        double a = sc.nextDouble();
        
        System.out.println("Dame el número b");
        double b = sc.nextDouble();
        
        System.out.println("Dame el número c");
        double c = sc.nextDouble();
        
        System.out.println("Dame el número d");
        double d = sc.nextDouble();
        
        double resultado1 = (a+b*38)/(c*d);
        double resultado2 = a+((30-b)/(c+d));
        double resultado3 = b*a*((a+b)/(b/d));
        double resultado4 = ((a+50)/b)/(c/(4+d));
        
        System.out.println(+a+"+"+b+"*"+38+" dividido por "+c+"*"+d+" es igual a: "+resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        
    }
}
