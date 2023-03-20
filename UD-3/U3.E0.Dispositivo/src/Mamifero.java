/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Mamifero {

    protected double peso;
    protected String alimentacion;
    
    public void nace(){
        System.out.println("nace");
    }
    
    public void crece(){
        System.out.println("crece");
    }
    
    public void reproduce(Mamifero m){
        m=new Mamifero();
    }
    
    public void muere(){
        System.out.println("muere");
    }
}
