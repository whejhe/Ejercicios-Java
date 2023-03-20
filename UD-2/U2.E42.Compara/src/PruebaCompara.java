/**
 *
 * @author usuario
 */
public class PruebaCompara {
    public static void main(String[] args) {
        
        Compara c = new Compara();
        
        c.setCadena1("Ana");
        c.setCadena2("Anacleto");
        System.out.println(c.sonIguales());
        
        c.setCadena1("Pedro");
        c.setCadena2("pedro");
        System.out.println(c.sonIguales());
        
        c.setCadena1("Ana");
        c.setCadena2("ana");
        System.out.println(c.sonIguales());
        
        
        
    }
}
