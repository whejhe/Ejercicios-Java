/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Dispositivo {
    
    private String marca;
    private String modelo;
    private boolean encender;
    
    public void encender(){
        encender=true;
    }
    
    public void apagar(){
        encender=false;
    }
    
    public boolean isEncender() {
        if(encender==false){
            System.out.println("Dispositivo apagado");
        }else{
            System.out.println("Dispositivo encendido");
        }
        return encender;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
