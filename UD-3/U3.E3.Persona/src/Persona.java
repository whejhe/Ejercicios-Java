
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Persona {

    private String nombre;
    private String dni;
    private Vehiculo[] coches = new Vehiculo[3];
    private int numCochesActual;
    private boolean lleno = false;

    public Persona() {

    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void comprarCoche(Vehiculo coche) {
        for (int i = 0; i < coches.length; i++) {
            if (coches[i] == null) {
                //coches[i]=coche;
                numCochesActual++;
                break;
            }
        }
        if (numCochesActual > 3) {
            lleno = true;
        }
        if (lleno == true) {
            System.out.println("Ya no puedes tener más coches");
        }
    }

    public void arrancarCoche(Vehiculo coche) {
        coche.arrancar();
    }

    public void apagarCoche(Vehiculo coche) {
        coche.apagar();
    }

    public void recorrerDistancia(Vehiculo coche, double numKm) {
        coche.recorrerDistancia(numKm);
    }

    public void reponerCombustible(Vehiculo coche, double numLitros) {
        coche.reponerCombustible(numLitros);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Vehiculo[] getCoches() {
        return coches;
    }

    public int getNumCochesActual() {
        if(numCochesActual>3){
            numCochesActual=3;
        }
        return numCochesActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
