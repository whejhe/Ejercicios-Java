
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class EscrituraFichero {
    private String nombreFichero = "";
    private File fichero;
    private FileWriter fw;
    private PrintWriter pw;
    private boolean abierto = false;

    public EscrituraFichero(String nombre) {
        if (nombre != null) {
            nombreFichero = nombre;
        }
    }

    public void abrir() throws IOException {
        fichero = new File(nombreFichero);
        fw = new FileWriter(fichero);
        pw = new PrintWriter(fw);
        abierto = true;
    }

    public void cerrar() throws IOException {
        if (abierto) {
            pw.close();
            fw.close();
            abierto = false;
        } else {
            throw new IllegalStateException("El fichero no está abierto");
        }
    }

    /*public void escribeTexto(List<String> linea) throws IOException{
        if(abierto){
            Iterator<String> iter = linea.iterator();
            while(iter.hasNext()){
                String text = iter.next();
                pw.println(text);
            }
        }else{
            throw new IllegalStateException("Elfichero no esta abierto");
        }
    }*/
    
    public void escribeTexto(String linea) {
        if (abierto) {
            pw.println(linea);
        } else {
            throw new IllegalStateException("El fichero no está abierto");
        }
    }
    
}
