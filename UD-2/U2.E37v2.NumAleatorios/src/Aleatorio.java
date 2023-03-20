
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Aleatorio {

    public static void main(String[] args) {

        int[] aleatorio = new int[500];

        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * 1000 + 1);
        }

        for (int i = 0; i < aleatorio.length; i++) {
            if (aleatorio[i] % 2 == 0 && aleatorio[i]>=800) {
                System.out.print(aleatorio[i]+"/");
            }
        }

    }
}
