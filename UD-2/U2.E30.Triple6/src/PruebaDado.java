
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */

public class PruebaDado {

    public static void main(String[] args) {

        Dado d = new Dado();
        
        int numTirada;
        int contador=0;
        
        while(contador<3){
            numTirada=d.tirada();
            System.out.println("Nº "+numTirada);
            if(numTirada==6){
                contador++;
            }
        }
        System.out.println("Ha salido el 6 tres veces");
    }
}
