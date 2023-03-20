package es.marca.futbol.jugadores;

public class Futbolista {
    
    public String nombre;
    public String apellidos;
    public int numGoles;
    public double salario;
    public boolean lesionado;

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
    
    public void marcaGol(int numGoles){
        this.numGoles=numGoles+this.numGoles;
    }
    
    public void golAnulado(){
        numGoles--;
    }
    public void seLesiona(){
        lesionado=true;
    }
    public void seRecupera(){
        lesionado=false;
    }
    
}
