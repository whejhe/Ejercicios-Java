/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Usuario {

    private String nombre;
    private String password;
    private Cliente cliente;
    
    public Usuario(String nombre,String pass,Cliente cliente){
        this.nombre=nombre;
        this.password=pass;
        if(cliente==null){
            System.out.println("Advertencia: este usuario se asociará a un cliente anónimo");
            this.cliente = new Cliente("anonimo","anonimo",this);
        }else{
            this.cliente=cliente;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
