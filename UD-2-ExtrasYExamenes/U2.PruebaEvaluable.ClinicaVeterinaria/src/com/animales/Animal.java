package com.animales;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Animal {
    
    public String tipo;
    public int edad;
    public String sexo;
    public boolean patologia;
    public String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean isPatologia() {
        return patologia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPatologia(boolean patologia) {
        this.patologia = patologia;
    }
    
    
    
}
