/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class Matriculados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.println("Dime el nº de alumnos");
        numero=sc.nextInt();
        int alta=-1;
        int baja=101;
        int posBaja=0;
        int posAlta=0;
        int Total=0;
        
        
        int[] numMatriculados = new int[numero];
        
        //Añade un valor random a cada posicion y suma los valores
        for(int i=0;i<numMatriculados.length;i++){
            numMatriculados[i]=(int)(Math.random()*100+1);
            System.out.print(numMatriculados[i]+" - ");
            Total=Total+numMatriculados[i];
        }
        System.out.println("");
        /*--------------------------------------------------------------------*/
        //Busca la nota más alta
        for(int i=0;i<numMatriculados.length;i++){
            if(numMatriculados[i]>alta){
                alta=numMatriculados[i];
                posAlta=i;//Te da la posicion en la Array
            }
        }
        //Cuenta las posiciones hasta encontrar la nota más alta
       /*for(int i=0;i<numMatriculados.length;i++){
            posAlta++;
            if(numMatriculados[i]==alta){
                break;
            }
        }*/
        System.out.println("La nota más alta de la clase es "+alta+" y está en la posición "+posAlta+" del array.");
        /*--------------------------------------------------------------------*/
        //Busca la nota más baja
        for(int i=0;i<numMatriculados.length;i++){
            if(numMatriculados[i]<baja){
                baja=numMatriculados[i];
                posBaja=i;
            }
        }
        //Cuenta las posiciones hasta encontrar la nota más alta
        /*for(int i=0;i<numMatriculados.length;i++){
            posBaja++;
            if(numMatriculados[i]==baja){
                break;
            }
        }*/
        System.out.println("La nota más baja de la clase es "+baja+" y está en la posición "+posBaja+" del array.");
        /*--------------------------------------------------------------------*/
        
        //Realiza la media entre el nº de matriculados
        System.out.println("La nota media de la clase es "+Total/numero+".");
        
    }
}
