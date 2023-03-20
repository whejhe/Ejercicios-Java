/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Concesionario {
    
    private String nombre;
    private String cif;
    private String direccionPostal;
    private String email;
    
    public Concesionario(String nombre,String cif,String direccionPostal){
        this.nombre=nombre;
        this.cif=cif;
        this.direccionPostal=direccionPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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
    
    
}
