
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class MensajeMail implements InterfazMensajeMail {

    private String asunto;
    private String contenido;
    private String remitente;
    private String destinatario;
    private Fichero fichero;

    @Override
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String getAsunto() {
        return asunto;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setRemitente(String direccionEmail) {
        if (direccionEmail.contains("@") && direccionEmail.length() >= 5) {
            remitente = direccionEmail;
        } else {
            System.out.println("Direccion erronea");
        }
    }

    @Override
    public String getRemitente() {
        return remitente;
    }

    @Override
    public void setDestinatario(String direccionEmail) {
        if (direccionEmail.contains("@") && direccionEmail.length() >= 5) {
            destinatario = direccionEmail;
        } else {
            System.out.println("Direccion erronea");
        }
    }

    @Override
    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public void setFicheroAdjunto(Fichero fichero) {
        this.fichero=fichero;
    }

    @Override
    public void eliminaFicheroAdjunto() {
        this.fichero=null;
    }

    @Override
    public Fichero getFicheroAdjunto() {
        return fichero;
    }

    @Override
    public void envia() {
        if (destinatario == null || remitente == null) {
            System.out.println("Destinatario o remitente no es correcto");
        } else if (asunto == null || contenido == null) {
            System.out.println("Ojo estás enviando un mensaje sin asunto o contenido");
        } else {
            System.out.println("Mensaje enviado de " + getRemitente() + " a " + getDestinatario() + " con asunto " + getAsunto());
            if(fichero !=null){
                System.out.println("Fichero: "+fichero.toString());
                System.out.println("Tamaño de bytes: "+fichero.getTamanioEnBytes());
            }
        }
    }

}
