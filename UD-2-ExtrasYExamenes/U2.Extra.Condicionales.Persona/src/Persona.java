
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Persona {

    public String nombre;
    public int aniosEnFront;
    public int aniosEnBack;
    public boolean sabeAngular;
    public boolean sabeReact;
    public boolean sabeSpring;
    public boolean sabeLaravel;
    public boolean cochePropio;
    public boolean disponibleViajes;

    public String getNombre() {
        return nombre;
    }

    public int getAniosEnFront() {
        return aniosEnFront;
    }

    public int getAniosEnBack() {
        return aniosEnBack;
    }

    public boolean isSabeAngular() {
        return sabeAngular;
    }

    public boolean isSabeReact() {
        return sabeReact;
    }

    public boolean isSabeSpring() {
        return sabeSpring;
    }

    public boolean isSabeLaravel() {
        return sabeLaravel;
    }

    public boolean isCochePropio() {
        return cochePropio;
    }

    public boolean isDisponibleViajes() {
        return disponibleViajes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAniosEnFront(int aniosEnFront) {
        this.aniosEnFront = aniosEnFront;
    }

    public void setAniosEnBack(int aniosEnBack) {
        this.aniosEnBack = aniosEnBack;
    }

    public void setSabeAngular(boolean sabeAngular) {
        this.sabeAngular = sabeAngular;
    }

    public void setSabeReact(boolean sabeReact) {
        this.sabeReact = sabeReact;
    }

    public void setSabeSpring(boolean sabeSpring) {
        this.sabeSpring = sabeSpring;
    }

    public void setSabeLaravel(boolean sabeLaravel) {
        this.sabeLaravel = sabeLaravel;
    }

    public void setCochePropio(boolean cochePropio) {
        this.cochePropio = cochePropio;
    }

    public void setDisponibleViajes(boolean disponibleViajes) {
        this.disponibleViajes = disponibleViajes;
    }

}
