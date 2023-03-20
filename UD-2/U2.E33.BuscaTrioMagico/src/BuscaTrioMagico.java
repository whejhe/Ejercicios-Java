/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class BuscaTrioMagico {
    public static void main(String[] args) {
        
        int x,z,y;
        
        for(x=0;x<10;x++){
            for(y=0;y<10;y++){
                for(z=0;z<10;z++){
                    if(x%2==0 && y%2!=0 && z%2==0 && (x+y+z)>10 && (x*y*z)<90){
                        System.out.println("X vale "+x);
                        System.out.println("Y vale "+y);
                        System.out.println("Z vale "+z);
                        System.out.println(x+"+"+y+"+"+z+"="+(x+y+z)+"(>10)");
                        System.out.println(x+"*"+y+"*"+z+"="+(x*y*z)+"(<90)");
                        System.out.println("");
                    }
                }
            }
        }
        
    }
}
