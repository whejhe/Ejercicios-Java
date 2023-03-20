
/**
 *
 * @author usuario
 */
public class Impresora {

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private boolean encendida;
    private double numMililitros;
    private int capacidadMax;

    public Impresora(String marca, String modelo, int anioFabricacion, int capacidadMax) {
        encendida = false;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        if (anioFabricacion <= 0) {
            this.anioFabricacion = 2000;
        }
        this.capacidadMax = capacidadMax;
        numMililitros = this.capacidadMax;
        if (capacidadMax <= 0) {
            this.capacidadMax = 7;
        }
    }

    public Impresora(String marca, String modelo, int anioFabricacion) {
        encendida = false;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        if (anioFabricacion <= 0) {
            this.anioFabricacion = 2000;
        }
        if (marca.equalsIgnoreCase("Epson") || marca.equalsIgnoreCase("Brother")) {
            capacidadMax = 10;
        } else if (marca.equalsIgnoreCase("hp") && modelo.equalsIgnoreCase("r30")) {
            capacidadMax = 30;
        } else if (marca.equalsIgnoreCase("kodak")) {
            capacidadMax = 5;
        } else {
            capacidadMax = 7;
        }
        numMililitros = this.capacidadMax;
    }
    
    public void encender() {
        if (encendida == true) {
            System.out.println("error: ya esta encendida");
        }
        encendida = true;
    }

    public void apagar() {
        if (encendida == false) {
            System.out.println("error: ya esta apagada");
        }
        encendida = false;
    }

    public void recargar(int numMililitros) {
        if (encendida == true) {
            System.out.println("error, tienes que apagar la impresora para cargarla");
        } else {
            this.numMililitros = numMililitros;
        }
    }

    public void mostrarEstado() {
        if (encendida == false) {
            System.out.println("error,impresora apagada");
        } else {
            System.out.println("Marca = " + marca + ",Modelo = " + modelo
                    + ",Año de Fabricacion = " + anioFabricacion + ",Estado = " + encendida
                    + ",Nº Mililitros = " + numMililitros + ",Capacidad Max = " + capacidadMax);

            numMililitros = numMililitros - 0.5;
        }
    }

    public void imprimir() {
        if (numMililitros >= 0.5) {
            System.out.println("Se ha impreso 1 página");
            numMililitros = numMililitros - 0.5;
        } else {
            System.out.println("No queda suficiente tinta");
        }
    }

    public void imprimir(int numPag) {
        int contador = 0;
        if (numMililitros < 0.5) {
            System.out.println("No queda suficiente tinta");
        } else {
            for (int i = 0; i < numPag; i++) {
                if (numMililitros < 0.5) {
                    System.out.println("No queda suficiente tinta");
                    break;
                }
                contador++;
                System.out.println("Se ha impreso " + contador + " página");
                numMililitros = numMililitros - 0.5;
            }
        }

    }

}
