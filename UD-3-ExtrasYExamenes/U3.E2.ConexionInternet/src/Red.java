
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Red implements InterfazRed {

    private String direccionLocal = "";
    private String direccionRemota = "";
    private int puertoLocal = 0;
    private int puertoRemoto = 0;
    private InterfazFichero miFichero;
    private boolean conectado;

    @Override
    public void setDireccionLocal(String ip) {
        direccionLocal = ip;
    }

    @Override
    public String getDireccionLocal() {
        return direccionLocal;
    }

    @Override
    public void setDireccionRemota(String ip) {
        direccionRemota = ip;
    }

    @Override
    public String getDireccionRemota() {
        return direccionRemota;
    }

    @Override
    public void setPuertoLocal(int puerto) {
        puertoLocal = puerto;
    }

    @Override
    public int getPuertoLocal() {
        return puertoLocal;
    }

    @Override
    public void setPuertoRemoto(int puerto) {
        puertoRemoto = puerto;
    }

    @Override
    public int getPuertoRemoto() {
        return puertoRemoto;
    }

    @Override
    public void abrirConexionRemota() {
        if (puertoLocal != 0 && !direccionLocal.equalsIgnoreCase("") && !direccionRemota.equalsIgnoreCase("")) {
            System.out.println("Conexion establecida");
            conectado = true;
        }
    }

    @Override
    public void cerrarConexionRemota() {
        direccionRemota = "";
        puertoRemoto = 0;
    }

    @Override
    public void enviar(InterfazFichero fich) {
        if (conectado == true) {
            miFichero = fich;
            System.out.println("Se han enviado " + miFichero.getTamanioEnBytes() + " bytes del fichero " + miFichero.getNombre() 
                    + " desde " + direccionLocal + ":" + puertoLocal + " a " + direccionRemota + ":" + puertoRemoto);
        } else {
            System.out.println("Error, sin conexion");
        }

    }

    @Override
    public InterfazFichero recibir() {
        if (conectado == true) {
            System.out.println("Se han recibido " + miFichero.getTamanioEnBytes() + " bytes del fichero " 
                    + miFichero.getNombre()+ " desde " + direccionRemota + ":" + puertoRemoto + " a " + direccionLocal + ":" + puertoLocal);
            return miFichero;
        } else {
            return miFichero=null;
        }
    }

}
