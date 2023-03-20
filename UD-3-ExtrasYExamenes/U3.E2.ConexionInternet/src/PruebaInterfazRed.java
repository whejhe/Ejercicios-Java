/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaInterfazRed {
    public static void main(String[] args) {
        
        Fichero f = new Fichero();
        Red r = new Red();
        
        f.setNombre("miArchivo");
        f.setCodificacion("UTF-8");
        f.setContenido("blablablablabla");
        
        r.setDireccionLocal("48398730");
        r.setDireccionRemota("67880707");
        r.setPuertoLocal(26);
        r.setPuertoRemoto(89);
        r.abrirConexionRemota();
        r.enviar(f);
        r.recibir();
        
    }
}
