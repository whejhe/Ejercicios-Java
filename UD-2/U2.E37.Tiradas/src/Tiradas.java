
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Tiradas {

    public static void main(String[] args) {

        final int NUM_TIRADAS = 50;
        int[] tiradas = new int[NUM_TIRADAS];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;

        //for(int i:tiradas)
        for (int i = 0; i < tiradas.length; i++){
            tiradas[i] = (int) (Math.random() * 6 + 1);
            System.out.print(tiradas[i] + " - ");
            if (tiradas[i] == 1) {
                num1++;
            } else if (tiradas[i] == 2) {
                num2++;
            } else if (tiradas[i] == 3) {
                num3++;
            } else if (tiradas[i] == 4) {
                num4++;
            } else if (tiradas[i] == 5) {
                num5++;
            } else {
                num6++;
            }
        }
        
        System.out.println("");
        System.out.println("""
                           Se ha analizado NUM_TIRADAS tiradas de un dado de 6 caras 
                           y se obtienen los siguientes resultados:
                           """);
        System.out.println("El número 1 ha aparecido " + num1 + " veces.");
        System.out.println("El número 2 ha aparecido " + num2 + " veces.");
        System.out.println("El número 3 ha aparecido " + num3 + " veces.");
        System.out.println("El número 4 ha aparecido " + num4 + " veces.");
        System.out.println("El número 5 ha aparecido " + num5 + " veces.");
        System.out.println("El número 6 ha aparecido " + num6 + " veces.");
    }
}
