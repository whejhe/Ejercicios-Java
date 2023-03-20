/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface ICarroCompra {
    
    void meteEnCarro(Articulo art);
    void muestraArticulosCarro();
    int getNumArticulosActual();
    void vaciarCarro();
    double calculaImporteCarro();
    
}
