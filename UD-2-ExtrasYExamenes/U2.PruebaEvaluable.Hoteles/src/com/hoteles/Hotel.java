package com.hoteles;


/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */

public class Hotel {
    
    public double distCentro;
    public boolean conPiscina=false;
    public boolean abierta24h=false;
    public int numIdiomas;

    public double getDistCentro() {
        return distCentro;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public boolean isAbierta24h() {
        return abierta24h;
    }

    public int getNumIdiomas() {
        return numIdiomas;
    }

    public void setDistCentro(double distCentro) {
        this.distCentro = distCentro;
    }

    public void setConPiscina(boolean conPiscina) {
        this.conPiscina = conPiscina;
    }

    public void setAbierta24h(boolean abierta24h) {
        this.abierta24h = abierta24h;
    }

    public void setNumIdiomas(int numIdiomas) {
        this.numIdiomas = numIdiomas;
    }
        
    
}
