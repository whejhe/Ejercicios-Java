

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaArrays {
    public static void main(String[] args) {
        
        double notas[] = new double[25];      
        notas[2]=4.3;
        notas[3]=5.3;
        notas[5]=5.6;
        notas[7]=7.8;
        
        int metrosRecorridos[] = {200,400,800,1500,4200};
        
        System.out.println("Posicion 0 - Nota:"+notas[3]);
        System.out.println("Posicion 2 - Nota:"+notas[2]);
        System.out.println("Posicion 4 - Nota:"+notas[4]);
        System.out.println("Posicion 5 - Nota:"+notas[5]);
        
        /*-------------------------------------------------------------------*/
        System.out.println("");
        
        System.out.println("Posicion 0: "+metrosRecorridos[0]);
        System.out.println("Posicion 1: "+metrosRecorridos[1]);
        System.out.println("Posicion 2: "+metrosRecorridos[2]);
        //System.out.println("Posicion 30: "+metrosRecorridos[30]);
        
        
    }
}
