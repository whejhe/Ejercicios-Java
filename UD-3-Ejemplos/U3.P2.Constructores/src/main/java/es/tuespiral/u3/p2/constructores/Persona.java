
package es.tuespiral.u3.p2.constructores;

public class Persona {
    private String nombre, apellidos;
    private int edad, altura;
    private boolean casada;

    public Persona(String nombre, String apellidos, int edad, int altura, boolean casada) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
        this.casada = casada;
    }
        
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isCasada() {
        return casada;
    }

    public void setCasada(boolean casada) {
        this.casada = casada;
    }
    
    
}
