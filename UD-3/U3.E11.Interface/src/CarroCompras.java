/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class CarroCompras implements ICarroCompra{
    
    private Articulo[] carro;
    private int NumArticulosCarro;
    private double calculaImporteCarro;

    @Override
    public void meteEnCarro(Articulo art) {
         carro[NumArticulosCarro]=art;
         NumArticulosCarro++;
    }

    @Override
    public void muestraArticulosCarro() {
        for(int i=0;i<carro.length;i++){
            System.out.println("Articulo "+i+": "+toString());
        }
    }

    @Override
    public int getNumArticulosActual() {
        return NumArticulosCarro;
    }

    @Override
    public void vaciarCarro() {
        Articulo[] carro;
    }

    @Override
    public double calculaImporteCarro() {
        double Total=0;
        for(int i=0;i>carro.length;i++){
            Total=Total+carro[i].getPrecio();     
        }
        return Total;
    }

    @Override
    public String toString() {
        return "NumArticulosCarro=" + NumArticulosCarro + ", calculaImporteCarro=" + calculaImporteCarro;
    }
    
    

}
