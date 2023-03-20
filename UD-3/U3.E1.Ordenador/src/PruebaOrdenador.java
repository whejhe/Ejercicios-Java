/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaOrdenador {
    public static void main(String[] args) {
        
        Ordenador o1 =new Ordenador();
        Ordenador o2 =new Ordenador("Dell","X540");
        Ordenador o3 =new Ordenador("Toshiba","Portege Z30",2005);
        
        o1.imprimeEstado();
        System.out.println("");
        o2.imprimeEstado();
        System.out.println("");
        o3.imprimeEstado();
        
        
    }
}
