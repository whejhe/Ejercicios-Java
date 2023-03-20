/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Dispositivo {

    private boolean encendido;
    private String marca,modelo;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void encender(){
        encendido=true;
    }
    
    public void apagar(){
        encendido=false;
    }

    public boolean isEncendido() {
        return encendido;
    }
    
    public void error(){
        System.out.println("Error,dispositivo apagado");
    }
    
}
