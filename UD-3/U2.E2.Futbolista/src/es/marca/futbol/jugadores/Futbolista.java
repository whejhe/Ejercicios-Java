package es.marca.futbol.jugadores;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Futbolista {
    
    private String nombre;
    private String apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;
    
    public Futbolista(String nombre,String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
    
    public void marcaGol(){
        numGoles++;
    }
    
    public void marcaGool(int numGoles){
        this.numGoles=this.numGoles+numGoles;
    }
    
    public void golAnulado(){
        if(numGoles==0){
            System.out.println("Error: no se puede anular el gol");
        }else{
            numGoles--;
        }
    }
    
    public void golAnulado(int numGoles){
        if(this.numGoles-numGoles>=0){
            this.numGoles=this.numGoles-numGoles;
        }else{
            System.out.println("Error: no se puede anular "+numGoles+" goles");
        }
    }
    
    
}
