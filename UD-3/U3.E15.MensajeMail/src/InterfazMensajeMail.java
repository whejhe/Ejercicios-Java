/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface InterfazMensajeMail {
    
    void setAsunto(String asunto);
    String getAsunto();
    void setContenido(String contenido);
    String getContenido();
    void setRemitente(String direccionEmail);
    String getRemitente();
    void setDestinatario(String direccionEmail);
    String getDestinatario();
    void setFicheroAdjunto(Fichero fichero);
    void eliminaFicheroAdjunto();
    Fichero getFicheroAdjunto();
    void envia();
    
}
