/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaMensajeMail {
    public static void main(String[] args) {
        
        MensajeMail m = new MensajeMail();
        Fichero f = new Fichero();

        f.setNombre("miFichero");
        f.setCodificacion("UTF-8");
        f.setContenido("blablablabla");
        
        m.setAsunto("miAsunto");
        m.setContenido("archivos");
        //m.setRemitente("bad");
        m.setRemitente("remitente@gmail");
        m.setDestinatario("destino@gmail");
        m.setFicheroAdjunto(f);
        //m.eliminaFicheroAdjunto();
        m.envia();
        
    }
}
