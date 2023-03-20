/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Mamifero {
    
    private String nombre;
    private int anioNacimiento;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
    public void haceRuido(){
        System.out.println("No sé qué ruido hago. Puedo ser muchas cosas");
    }
}
