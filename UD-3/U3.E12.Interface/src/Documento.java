/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Documento implements InterfazDocumento {

    private String Titulo;
    private String Contenido;
    private int NumPaginasImpresion; 

    @Override
    public String getTitulo() {
        return Titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.Titulo=titulo;
    }

    @Override
    public String getContenido() {
        return Contenido;
    }

    @Override
    public void setContenido(String contenido) {
        this.Contenido=contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
        return NumPaginasImpresion;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
        this.NumPaginasImpresion=numPaginas;
    }
    
    
}
