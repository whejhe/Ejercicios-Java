/**
 *
 * @author Carlos Fernandez
 */
import java.util.Scanner;

public class MenuFormulas {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=8;
        int c=2;
        int d=2;
        int option;
        
        System.out.println("MENU CALCULO");
        System.out.println("1 – Calcula la fórmula 1 usando la división entre enteros");
        System.out.println("2 – Calcula la fórmula 1 usando la división entre números reales");
        System.out.println("3 – Calcula la fórmula 2 usando la división entre enteros");
        System.out.println("4 – Calcula la fórmula 2 usando la división entre números reales");
        System.out.println("Escoge una opcion:");
        option=sc.nextInt();
        
        switch(option){
            case 1:
                int resultado=a+((30-b)/(c+d));
                System.out.println("El resultado del cálculo es "+resultado);
                break;
            case 2:
                double resultado2=a+((double)(30-b)/(c+d));
                //System.out.println(a+"+((30-"+b+")/("+c+"+"+d+"))= "+resultado2);
                System.out.println("El resultado del cálculo es "+resultado2);
                break;
            case 3:
                int resultado3=(a+b*38)/(c*d);
                System.out.println("El resultado del cálculo es "+resultado3);
                break;
            case 4:
                double resultado4=(a+(double)b*38)/(double)(c*d);
                System.out.println("El resultado del cálculo es "+resultado4);
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
