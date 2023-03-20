package com.animales;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class ServiciosAnimal {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.setNombre("Totoro");
        a.setTipo("hamster");
        a.setEdad(2);
        a.setSexo("hembra");
        a.setPatologia(true);
        
        if(a.getTipo().equalsIgnoreCase("perro") && a.isPatologia()==false && a.getEdad()>1){
            System.out.println("Se ha contratado el servicio de Peluqueria para "+a.getNombre());
        }else if(a.getEdad()>=0 && a.getEdad()<1 && a.getTipo().equalsIgnoreCase("gato") 
                && (a.isPatologia()==false || a.getSexo().equalsIgnoreCase("hembra"))){
            
            System.out.println("Se ha contratado el servicio de Guarderia felina para "+a.getNombre());
        }else if(a.getTipo().equalsIgnoreCase("hamster") || a.isPatologia()==true)
            if(a.getEdad()>1){
                System.out.println("Se ha contratado el servicio de Ecografia para "+a.getNombre());
            
        }else{
                System.out.println("Se ha contratado el servicio de Medicina para "+a.getNombre());
            }
        
    }
}
