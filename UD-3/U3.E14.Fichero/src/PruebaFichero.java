/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaFichero {
    public static void main(String[] args) {
        
        Fichero f = new Fichero();
        
        System.out.println("Codificacion: "+f.getCodificacion());
        //f.borraContenido();
        //f.abrir();
        f.agregaContenido("blablablablablabla");
        System.out.println(f.getContenido());
        System.out.println("Tamaño en Bytes: "+f.getTamanioEnBytes());
        
        
        f.setCodificacion("UTF-16");
        //f.setCodificacion("UTF-30");
        System.out.println("Codificacion: "+f.getCodificacion());
        System.out.println("Tamaño en Bytes: "+f.getTamanioEnBytes());
        
    }
}
