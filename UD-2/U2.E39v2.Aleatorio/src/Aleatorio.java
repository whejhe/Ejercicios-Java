/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Aleatorio {
    public static void main(String[] args) {
        
        int[] pos = new int[500];
        int posMayor=pos[0];
        
        for(int i=0;i<pos.length;i++){
            pos[i]=(int)(Math.random()*1000000);
            if(pos[i]>posMayor){
                posMayor=pos[i];
            }
            System.out.print(pos[i]+"/");
        }
        System.out.println("");
        System.out.println("Posicion Mayor: "+posMayor);
        
    }
}
