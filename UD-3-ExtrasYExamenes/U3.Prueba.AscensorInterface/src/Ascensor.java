/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Ascensor implements AscensorInterface{
    
    private String marca;
    private String modelo;
    private int numMaxPlantasEdificio;
    private int plantaActual=0;
    
    public Ascensor(String marca, String modelo, int numMaxPlantasEdificio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numMaxPlantasEdificio = numMaxPlantasEdificio;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getNumMaxPlantasEdificio() {
        return numMaxPlantasEdificio;
    }

    @Override
    public int getPlantaActual() {
        return plantaActual;
    }

    @Override
    public void sube(int plantaDestino) {
        if(plantaDestino>numMaxPlantasEdificio || plantaDestino<0){
            System.out.println("Error, esta planta no existe");
        }else if(plantaActual>plantaDestino){
            System.out.println("Mejor usa el boton de bajar");
        }else{
            plantaActual=plantaDestino;
            System.out.println("Has llegado a la planta "+plantaActual);
        }
    }

    @Override
    public void baja(int plantaDestino) {
        if(plantaDestino<0){
            System.out.println("Error, esta planta no existe");
        }else if(plantaActual<plantaDestino){
            System.out.println("Mejor usa el boton de Subir");
        }else{
            plantaActual=plantaDestino;
            System.out.println("Has llegado a la planta "+plantaActual);
        }
    }

    @Override
    public String toString() {
        return "Ascensor{" + "marca=" + marca + ", modelo=" + modelo + ", numMaxPlantasEdificio=" + numMaxPlantasEdificio + ", plantaActual=" + plantaActual + '}';
    }
    
    
    
}
