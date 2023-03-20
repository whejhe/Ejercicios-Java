
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Teclado {

    private Scanner sc;
    private int option;
    private String cadena;
    private boolean correcto = true;

    public Teclado() {
        sc = new Scanner(System.in);
    }

    public int leeEntero() {
        correcto=false;
        do{
            System.out.println("Numero Entero:");
            try{
                option = sc.nextInt();
                correcto=true;
            }catch(InputMismatchException e){
                System.out.println("Debes introducir un numero entero");
                sc.next();//limpia el buffer del Scanner
            }
        }while(!correcto);
        
        return option;
    }

    public int leeEntero(int minimo, int maximo) {
        do {
            leeEntero();
            if (option > maximo || option < minimo) {
                correcto = false;
                System.out.println("Debes teclear un entero comprendido entre mínimo y máximo");
            } else {
                correcto = true;
            }
        } while (!correcto);
        return option;
    }

    public int leeEnteroMax(int maximo) {
        do{
            leeEntero();
            if(option>maximo){
                correcto=false;
                System.out.println("Debes teclear un entero menor o igual que máximo");
            }else{
                correcto=true;
            }
        }while(!correcto);
        return option;
    }

    public int leeEnteroMin(int minimo) {
        do{
            leeEntero();
            if(option<minimo){
                correcto=false;
                System.out.println("Debes teclear un entero mayor o igual que mínimo");
            }else{
                correcto=true;
            }
        }while(!correcto);
        return option;
    }
    
    public int leerBinario(){
        correcto=false;
        do{
            System.out.println("Dame la cadena a leer:");
            try{
                cadena=sc.nextLine();
                option=Integer.parseInt(cadena,2);
                correcto=true;
            }catch(NumberFormatException e){
                System.out.println("El numero introducido no tiene el formato correcto");
                correcto=false;
            }
        }while(!correcto);
        return option;
    }
    
    public int leerOctal(){
        correcto=false;
        do{
            System.out.println("Dame la cadena a leer:");
            try{
                cadena=sc.next();
                option=Integer.parseInt(cadena,8);
                correcto=true;
            }catch(NumberFormatException e){
                System.out.println("El numero introducido no tiene el formato correcto");
                correcto=false;
            }
        }while(!correcto);
        return option;
    }
    
    public int leerHex(){
        correcto=false;
        do{
            System.out.println("Dame la cadena a leer:");
            try{
                cadena=sc.next();
                option=Integer.parseInt(cadena,16);
                correcto=true;
            }catch(NumberFormatException e){
                System.out.println("El numero introducido no tiene el formato correcto");
                correcto=false;
            }
        }while(!correcto);
        return option;
    }

}
