/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */

public class BuscaParejaMagica {
    public static void main(String[] args) {
        
        int x;
        int y;
        
        for(x=0;x<10;x++){
            for(y=0;y<10;y++){
                if(x%2==0 && y%2!=0 && x+y>6 && x*y<60){
                    System.out.println("X vale "+x);
                    System.out.println("Y vale "+y);
                    System.out.println(x+"+"+y+">6");
                    System.out.println(x+"*"+y+"<60");
                    System.out.println("");
                }
            }
        }
        
        
    }
}
