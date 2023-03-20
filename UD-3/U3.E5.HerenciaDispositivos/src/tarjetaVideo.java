/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class tarjetaVideo extends Dispositivo {
    
    private int memoria;
    private String textos;
    private int mostrarMemoria;
    private int mostrarTexto;
    private boolean encender;
    
    @Override
    public void encender(){
        encender=true;
    }
    
    @Override
    public void apagar(){
        encender=false;
    }
    
    @Override
    public boolean isEncender() {
        if(encender==false){
            System.out.println("Tarjeta de Video apagada");
        }else{
            System.out.println("Tarjeta de Video encendida");
        }
        return encender;
    }


    public int getMemoria() {
        mostrarMemoria++;
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getTextos() {
        mostrarTexto++;
        return textos;
    }

    public void setTextos(String textos) {
        this.textos = textos;
    }
    
    public void numOperaciones(){
        if(super.isEncender()==false){
            mostrarTexto=0;
            mostrarMemoria=0;
        }
        System.out.println("Textos mostrados: "+mostrarTexto);
        System.out.println("Numeros mostrados: "+mostrarMemoria);
    }
    
}
