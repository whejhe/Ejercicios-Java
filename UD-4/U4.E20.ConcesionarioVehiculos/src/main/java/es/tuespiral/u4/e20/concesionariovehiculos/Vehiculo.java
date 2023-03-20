package es.tuespiral.u4.e20.concesionariovehiculos;

import java.util.Objects;

public class Vehiculo implements Comparable {
    private String marca, modelo, matricula;
    private int anioFabric;
    private double precio;

    public Vehiculo(String marca, String modelo, String matricula, int anio_fabric, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anioFabric = anio_fabric;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anio_fabric=" + anioFabric + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!matricula.equals(other.matricula)) {
            return false;
        }
        return true;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public int compareTo(Object o) {
        Vehiculo otro = (Vehiculo) o;
        if(this.precio < otro.precio)
            return -1;
        else if (this.precio > otro.precio)
            return 1;
        else 
            return 0;
    }
    
}
