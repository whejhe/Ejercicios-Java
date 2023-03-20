
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Recursos {
    private final long ISBN;
    private String titulo;
    private List autores;
    private int numEjemplares;

    public Recursos(long ISBN, String titulo, List autores, int numEjemplares) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autores = new ArrayList(autores);
        this.numEjemplares = numEjemplares;
    }

    public Recursos(long isbn, String titulo, Autor autor, int numEjemplares) {
        this.ISBN = isbn;
        this.titulo = titulo;
        this.autores = new ArrayList();
        autores.add(autor);
        this.numEjemplares = numEjemplares;
    }
    
    @Override
    public String toString() {
        return "Recursos{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autores=" + autores + ", numEjemplares=" + numEjemplares + '}';
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(List autores) {
        this.autores = autores;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public List getAutores() {
        return autores;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.ISBN ^ (this.ISBN >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recursos other = (Recursos) obj;
        return this.ISBN == other.ISBN;
    }
    
    
    
    
}
