/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Impresora implements InterfazImpresora {
    
    private String Marca;
    private String Modelo;
    private boolean encendido;
    private int numFoliosBandeja=0;
    private boolean impresionOk;
    private boolean faltaPapel;
    private boolean recienEncendida;

    @Override
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    @Override
    public void encender(){
        encendido=true;
        recienEncendida=true;
    }
    
    @Override
    public void apagar(){
        encendido=false;
    }
    
    @Override
    public void cargarBandeja(int numFolios){
        recienEncendida=false;
        numFoliosBandeja=numFoliosBandeja+numFolios;
    }
    
    @Override
    public void imprimir(InterfazDocumento documento){
        recienEncendida=false;
        impresionOk=false;
        if(numFoliosBandeja<documento.getNumPaginasImpresion()){
            faltaPapel=true;
            System.out.println("Error: no hay suficiente papel para imprimir el documento "+documento.getTitulo());
        }else if(encendido==false){
            System.out.println("Impresora apagada");
        }else{
            faltaPapel=false;
            impresionOk=true;
            numFoliosBandeja=numFoliosBandeja-documento.getNumPaginasImpresion();
            System.out.println("Se está imprimiendo el documento "+documento.getTitulo()+" que ocupa "+documento.getNumPaginasImpresion()+" páginas");
        }   
    }
    
    @Override
    public String getEstado(){
        if(encendido==true && impresionOk==true){
            return "Ok";
        }else if(faltaPapel==true){
            return "Falta Papel";
        }else if(recienEncendida==true && encendido==true){
            return "OK";
        }else if(encendido==false){
            return "Fuera de servicio";
        }else{
            return "Fuera de servicio";
        }
    }

}
