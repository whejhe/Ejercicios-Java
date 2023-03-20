package es.tuespiral.u4.e20.concesionariovehiculos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Concesionario {
    private String nombre, direccion;
    private Set<Vehiculo> flota;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        flota = new HashSet<>();
    }
    
    public void agregaVehiculo(Vehiculo v) {
        flota.add(v);
    }
    
    public void actualizaVehiculo(Vehiculo v) {
        if(flota.contains(v)) {
            flota.remove(v);
            flota.add(v);
        }
    }
    
    public void borraVehiculo(Vehiculo v) {
        if(flota.contains(v)) {
            flota.remove(v);
        }
    }
    
    public void muestraVehiculos() {
        Iterator<Vehiculo> iter = flota.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
    
    public double calculaSumaPrecioVehiculos() {
        Iterator<Vehiculo> iter = flota.iterator();
        double suma = 0;
        while(iter.hasNext()) {
            suma = suma + iter.next().getPrecio();
        }
        return suma;
    }
    
    public double calculaMediaPrecioVehiculos() {
        Iterator<Vehiculo> iter = flota.iterator();
        double suma = 0;
        while(iter.hasNext()) {
            suma = suma + iter.next().getPrecio();
        }
        return suma/flota.size();
    }
    
    public double calculaMaximoPrecioVehiculos() {
        Iterator<Vehiculo> iter = flota.iterator();
        double maximo = -1.0;
        while(iter.hasNext()) {
            double precio = iter.next().getPrecio();
            if (precio > maximo) {
                maximo = precio;
            }
        }
        return maximo;
    }
    
    public double calculaMinimPrecioVehiculos() {
        Iterator<Vehiculo> iter = flota.iterator();
        double minimo = Double.MAX_VALUE;
        while(iter.hasNext()) {
            double precio = iter.next().getPrecio();
            if (precio < minimo) {
                minimo = precio;
            }
        }
        return minimo;
    }

}
