/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class pruebas {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Pepe","53276349T");
        Usuario u1 = new Usuario("pepeuser","1234",c1);
        Usuario u2 = new Usuario("juanuser","1234",null);
        
        
        System.out.println("Nombre: "+u2.getCliente().getNombre());
        System.out.println("DNI: "+u2.getCliente().getDni());
        System.out.println("");
        
        Cliente c2 = new Cliente("Juan","69845785B");
        u2.setCliente(c2);
        System.out.println("Nombre: "+u2.getCliente().getNombre());
        System.out.println("DNI: "+u2.getCliente().getDni());
        
    }
}
