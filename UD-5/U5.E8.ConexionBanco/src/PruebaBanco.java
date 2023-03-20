/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaBanco {

    
    public static void main(String[] args){
        
        Banco b = new Banco();
        
        try{
            b.abreConexion(1, "1234");
        }catch(CuentaOPinIncorrectoException e){
            System.out.println(e.getMessage());
        }
        
       
        try{
            b.abreConexion(1, "1234");
        }catch(CuentaOPinIncorrectoException e){
            System.out.println(e.getMessage());
        }
        
        try{
            b.abreConexion(1, "1234");
            b.realizaPago(b.getToken(), 2000);
        }catch(SaldoInsuficienteException | CuentaOPinIncorrectoException | TokenIncorrectoException e){
            System.out.println(e.getMessage());
        }
        
        try{
            b.cierraConexion(1);
        }catch(TokenIncorrectoException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
