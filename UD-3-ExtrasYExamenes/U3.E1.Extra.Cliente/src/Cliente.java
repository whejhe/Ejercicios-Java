/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Cliente {
    
    private String nombre;
    private String dni;
    private String direccionPostal;
    private String email;
    private Usuario usuario;
    
    public Cliente(String nombre,String dni,Usuario usu){
        this.nombre=nombre;
        this.dni=dni;
        usuario=usu;
    }
    
    public Cliente(String nombre,String dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

    
}
