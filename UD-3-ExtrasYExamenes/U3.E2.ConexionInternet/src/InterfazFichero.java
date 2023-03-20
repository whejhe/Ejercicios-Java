
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface InterfazFichero {

    String getNombre();
    void setNombre(String nombre);
    void setCodificacion(String codificacion);
    String getCodificacion();
    void abrir();
    void cerrar();
    void borraContenido();
    void agregaContenido(String contenido);
    String getContenido();
    int getTamanioEnBytes();
}
