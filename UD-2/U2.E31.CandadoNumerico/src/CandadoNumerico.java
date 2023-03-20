/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class CandadoNumerico {
    
    public int numSecreto;
    
    public void setNumSecreto(int nuevoNumeroSecreto){
        numSecreto=nuevoNumeroSecreto;
    }
    
    public boolean intentaAbrir(int numero){
        if(numSecreto==numero){
            return true;
        }else{
            return false;
        }
    }
    
}
