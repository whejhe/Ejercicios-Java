/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaCuentaCorriente {
    public static void main(String[] args) {
        
        try{
            CuentaCorriente cc = new CuentaCorriente(100,123456789,"1234");
            cc.intentaAccesoConPin("1234");
            System.out.println("Saldo Actual: "+cc.consultaSaldo()+"€");
            System.out.println("Nº de Cuenta: "+cc.getNumeroCuenta());
            cc.ingresa(200);
            cc.abona(20);
            System.out.println("Saldo Actual: "+cc.consultaSaldo()+"€");
        }catch(Exception e){
            System.out.println(e);
        }
        /*----------------------------------------------------------------------------------------*/
        try {
            CuentaCorriente c = new CuentaCorriente(12, 300, "abcd");
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(12, 300, "12");
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(-1, 300, "1234");
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(33, -3000, "1234");
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(33, 3000, "1234");
            c.ingresa(-1);
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(33, 3000, "1234");
            c.abona(-1);
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
