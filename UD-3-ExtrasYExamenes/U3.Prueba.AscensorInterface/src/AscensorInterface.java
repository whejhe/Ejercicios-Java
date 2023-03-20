/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface AscensorInterface {
    
    String getMarca();
    String getModelo();
    int getNumMaxPlantasEdificio();
    int getPlantaActual();
    void sube(int plantaDestino);
    void baja(int plantaDestino);
    @Override
    String toString();
    
}
