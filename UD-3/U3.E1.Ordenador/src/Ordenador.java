
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Ordenador {

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private boolean encendido;

    public Ordenador() {

    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        anioFabricacion = anio;
    }

    public void imprimeEstado() {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+anioFabricacion);
        System.out.println("Encendido: "+encendido);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
