package es.tuespiral.u4.p8.fundagenerica;

public class Dispositivo {
    private String marca, modelo;
    private boolean encendido;
    private double tamanio;

    public Dispositivo(String marca, String modelo, double tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", encendido=" + encendido + ", tamanio=" + tamanio + '}';
    }
    
    
}
