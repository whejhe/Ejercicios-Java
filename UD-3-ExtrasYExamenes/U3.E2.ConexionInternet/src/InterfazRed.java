/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface InterfazRed {
    
    void setDireccionLocal(String ip);
    String getDireccionLocal ();
    void setDireccionRemota (String ip);
    String getDireccionRemota ();
    void setPuertoLocal (int puerto);
    int getPuertoLocal();
    void setPuertoRemoto(int puerto);
    int getPuertoRemoto ();
    void abrirConexionRemota();
    void cerrarConexionRemota();
    void enviar (InterfazFichero fich);
    InterfazFichero recibir();
}
