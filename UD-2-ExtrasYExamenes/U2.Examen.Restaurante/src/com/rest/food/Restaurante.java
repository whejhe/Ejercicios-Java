package com.rest.food;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Restaurante {
    
    public boolean permiteReservas;
    public boolean ofrecenVegetariana;
    public int numPlazasSentadas;
    public int numEmpleados;

    public boolean isPermiteReservas() {
        return permiteReservas;
    }

    public boolean isOfrecenVegetariana() {
        return ofrecenVegetariana;
    }

    public int getNumPlazasSentadas() {
        return numPlazasSentadas;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setPermiteReservas(boolean permiteReservas) {
        this.permiteReservas = permiteReservas;
    }

    public void setOfrecenVegetariana(boolean ofrecenVegetariana) {
        this.ofrecenVegetariana = ofrecenVegetariana;
    }

    public void setNumPlazasSentadas(int numPlazasSentadas) {
        this.numPlazasSentadas = numPlazasSentadas;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }
    
    public double getRatioEmpleadosPlaza(){
        double operacion = numEmpleados/numPlazasSentadas;
        return operacion;
    }
    
}
