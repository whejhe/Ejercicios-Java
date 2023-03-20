/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaApartamento {
    public static void main(String[] args) {
        
        try{
            Apartamento a1 = new Apartamento(null,-1,600,true);
            a1.ocupar();
        }catch(NullPointerException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        /*--------------------------------------------------------------------*/            
        try{
            Apartamento a1 = new Apartamento("4647844T",-1,600,true);
            a1.ocupar();
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }   
        /*--------------------------------------------------------------------*/
        try{
            Apartamento a1 = new Apartamento("4647844T",20,600,true);
            a1.ocupar();
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        /*--------------------------------------------------------------------*/
        try{
            Apartamento a1 = new Apartamento("4647844T",20,100,true);
            a1.ocupar();
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        /*--------------------------------------------------------------------*/
        try{
            Apartamento a1 = new Apartamento("4647844T",20,100,false);
            a1.ocupar();
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        
    }
}
