
/**
 *
 * @author Carlos
 * @version 1.0
 */
public class Condiciones {
    public static void main(String[] args) {
        
        int edad=39;
        int altura=200;
        boolean casado=true;
        boolean trabajador=false;
        double salario=1800.50;
        boolean cochePropio=true;
        
        if(edad>=18 && altura<180 && casado==true && cochePropio==true){
            System.out.println("1-true");
        }else{
            System.out.println("1-false");
        }
        /*------------------------------------------------------------*/
        if(edad>=18 || altura<180 || casado==true || cochePropio==true){
            System.out.println("2-true");
        }else{
            System.out.println("2-false");
        }
        /*------------------------------------------------------------*/
        if(salario>=1800 && !(trabajador==false)&&!(edad<18)){
            System.out.println("3-true");
        }else{
            System.out.println("3-false");
        }
        /*------------------------------------------------------------*/
        if(salario>=1800 || !(trabajador==false)|| !(edad<18)){
            System.out.println("4-true");
        }else{
            System.out.println("4-false");
        }
        /*------------------------------------------------------------*/
        if(!trabajador && !casado){
            System.out.println("5-true");
        }else{
            System.out.println("5-false");
        }
        /*------------------------------------------------------------*/
        if(edad<39 && altura>=200 && cochePropio && casado){
            System.out.println("6-true");
        }else{
            System.out.println("6-false");
        }
        /*------------------------------------------------------------*/
        if(edad>39 || altura>200 || cochePropio){
            System.out.println("7-true");
        }else{
            System.out.println("7-false");
        }
        /*------------------------------------------------------------*/
        if(edad<39 && altura>=200 && cochePropio || casado){
            System.out.println("8-true");
        }else{
            System.out.println("8-false");
        }
        /*------------------------------------------------------------*/
        if(edad<39 && altura>=200 &&(cochePropio || casado)){
            System.out.println("9-true");
        }else{
            System.out.println("9-false");
        }
        
        
        
    }
}
