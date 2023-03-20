/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Moneda {
    
    private String nombre;
    private String simbolo;
    
    public Moneda(String nombre,String simbolo){
        this.nombre=nombre;
        this.simbolo=simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString() {
        return "" + simbolo;
    }
    
    
}
