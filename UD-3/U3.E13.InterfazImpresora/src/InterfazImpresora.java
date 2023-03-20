
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface InterfazImpresora {

    String getMarca();
    String getModelo();
    void encender();
    void apagar();
    void cargarBandeja(int numFolios);
    void imprimir(InterfazDocumento documento);
    String getEstado();

}
