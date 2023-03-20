/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface IPilaLibros {
    
    void apilar(Libro l);
    Libro desapilar();
    Libro verCima();
    int getNumElementos();
    void vaciar();
}
