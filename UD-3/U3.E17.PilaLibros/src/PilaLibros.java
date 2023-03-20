/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PilaLibros implements IPilaLibros{
    
    private int numElementos;
    Libro[] misLibros;

    public PilaLibros(int numElementos) {
        this.numElementos = numElementos;
    }
    
    @Override
    public void apilar(Libro l) {
        for(int i=0;i<misLibros.length;i++){
            
        }
    }

    @Override
    public Libro desapilar() {
    }

    @Override
    public Libro verCima() {
    }

    @Override
    public int getNumElementos() {
        return numElementos;
    }

    @Override
    public void vaciar() {
    }
    
    
}
