
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaDocumento {

    public static void main(String[] args) {

        Documento libro = new Documento();

        libro.setTitulo("El lobo estepario");
        libro.setContenido("blablablablablabla");
        libro.setNumPaginasImpresion(200);

        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Sinopsis: " + libro.getContenido());
        System.out.println("Paginas: " + libro.getNumPaginasImpresion());
    }
}
