/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Fichero implements InterfazFichero {
    
    private String nombre;
    private String codificacion="UTF-8";
    private boolean abierto;
    private String contenido="";
    private int tamanioEnBytes;

   
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCodificacion() {
        return codificacion;
    }

    @Override
    public void setCodificacion(String codificacion) {
        if(!codificacion.equalsIgnoreCase("UTF-16")){
            this.codificacion="UTF-8";
        }else{
            this.codificacion=codificacion;
        }
    }

    public boolean isAbierto() {
        return abierto;
    }

    @Override
    public void abrir(){
        abierto=true;
    }
    
    @Override
    public void cerrar(){
        abierto=false;
    }

    @Override
    public String getContenido() {
        if(abierto==true){
            return contenido;
        }else{
            return "";
        }
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void borraContenido() {
        if(abierto==true){
            contenido="";
        }
    }

    @Override
    public void agregaContenido(String contenido) {
        if(abierto==true){
            this.contenido=this.contenido+contenido;
        }else{
            System.out.println("Error, debes abrir el fichero");
        }
    }

    @Override
    public int getTamanioEnBytes() {
        if(codificacion.equalsIgnoreCase("UTF-8")){
            tamanioEnBytes=contenido.length();
        }else{
            tamanioEnBytes=contenido.length()*2;
        }
        return tamanioEnBytes;
    }
    
    
    
}
