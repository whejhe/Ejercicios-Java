

public class TarjetaVideo extends Dispositivo {
    private int numOperTexto, numOperEntero;


    @Override
    public void resetContadores(){
        numOperEntero=0;
        numOperTexto=0;
    }
    
    public void muestraEntero(int elem) {
        if (isEncendido()) {
            numOperEntero++;
            System.out.println(elem);
        }
        else 
            System.out.println("Error: dispositivo apagado");
    }
    
    public void muestraTexto(String texto) {
        if (isEncendido()) {
            numOperTexto++;
            System.out.println(texto);
        }
        else 
            System.out.println("Error: dispositivo apagado");
    }
    
    @Override
    public void apagar() {
        super.apagar();
        numOperTexto = 0;
        numOperEntero = 0;
    }

    @Override
    public String toString() {
        return super.toString()+ "TarjetaVideo: " + "numOperTexto= " + numOperTexto + ", numOperEntero= " + numOperEntero;
    }
    
    
}
