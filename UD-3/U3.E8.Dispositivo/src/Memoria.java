

public class Memoria extends Dispositivo {
    private final int TAM = 100;
    private int[] array = new int[TAM];
    private int numOperLectura, numOperEscritura;

    
    @Override
    public void resetContadores(){
        numOperEscritura=0;
        numOperLectura=0;
    }
    
    public void setElemPos (int pos, int elem) {
        if (isEncendido()) {
            if(pos >=0 && pos < TAM) {
                numOperEscritura++;
                array[pos] = elem;
            }
            else 
                System.out.println("Error: posición incorrecta");
        }
        else
            System.out.println("Error: dispositivo apagado");
    }
    
    public int getElemPos (int pos) {
        int resultado = -1;
        
        if (isEncendido()) {
            if(pos >=0 && pos < TAM) {
                numOperLectura++;
                resultado = array[pos];
            }
            else 
                System.out.println("Error: posición incorrecta");
        }
        else
            System.out.println("Error: dispositivo apagado");
        
        return resultado;
    }

    @Override
    public void apagar() {
        super.apagar();
        numOperLectura = 0;
        numOperEscritura = 0;
        
        array = new int[TAM]; // Borramos el contenido de la memoria
    }

    @Override
    public String toString() {
        return super.toString()+ "Memoria: " + "TAM= " + TAM + ", array= " + array + ", numOperLectura= " + numOperLectura + ", numOperEscritura= " + numOperEscritura;
        //return super.toString()+ "Memoria{" + "TAM=" + TAM + ", array=" + array + ", numOperLectura=" + numOperLectura + ", numOperEscritura=" + numOperEscritura + '}';
    }
    
    
    
}
