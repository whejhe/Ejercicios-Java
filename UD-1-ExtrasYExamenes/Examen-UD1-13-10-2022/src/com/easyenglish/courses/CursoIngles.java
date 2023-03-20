package com.easyenglish.courses;

public class CursoIngles {

    public String nivelCurso;
    public int numPlazasOfertadas;
    public int numPlazasOcupadas;
    public double cuotaMensual;

    public void setNivelCurso(String nuevoNivel) {
        nivelCurso = nuevoNivel;
    }

    public void setNumPlazasOfertadas(int numTotal) {
        numPlazasOfertadas = numTotal;
    }

    public void setCuotaMensual(double nuevaCuota) {
        cuotaMensual = nuevaCuota;
    }

    public String getNivelCurso() {
        return nivelCurso;
    }

    public int getNumPlazasOfertadas() {
        return numPlazasOfertadas;
    }

    public int getNumPlazasOcupadas() {
        return numPlazasOcupadas;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void altaAlumno() {
        numPlazasOcupadas++;
        numPlazasOfertadas--;
    }

    public void bajaAlumno() {
        numPlazasOcupadas--;
        numPlazasOfertadas++;
    }

    public double calculaCuotaUnHermano() {
        final double descuento = 20;
        cuotaMensual = cuotaMensual - (cuotaMensual * descuento) / 100;
        return cuotaMensual;
    }

    public double calculaCuotaDosOMasHermanos() {
        final double descuento = 40;
        cuotaMensual = cuotaMensual - (cuotaMensual * descuento) / 100;
        return cuotaMensual;
    }
}
