package com.rest;

import com.rest.food.Restaurante;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class ClasificadorRestaurantes {
    public static void main(String[] args) {
        
        Restaurante r = new Restaurante();
        Scanner sc = new Scanner(System.in);
        
        double valoracion;
        
        System.out.println("¿Permite Reserva?");
        r.setPermiteReservas(sc.nextBoolean());
        
        System.out.println("¿Ofrece comida vegetariana?");
        r.setOfrecenVegetariana(sc.nextBoolean());
        
        System.out.println("¿Cual es el nº de plazas sentadas?");
        r.setNumPlazasSentadas(sc.nextInt());
        
        System.out.println("¿De cuantos empleados dispone?");
        r.setNumEmpleados(sc.nextInt());
        
        if(r.isPermiteReservas()==true && r.isOfrecenVegetariana()==true && r.getNumPlazasSentadas()>100){
            valoracion=4;
        }else if(r.getNumPlazasSentadas()>=50 && r.getNumPlazasSentadas()<=100 && (r.isOfrecenVegetariana()==true || r.isPermiteReservas()==true)){
            valoracion=3;
        }else if(r.getNumPlazasSentadas()<50 && r.isPermiteReservas()==true){
            valoracion=2;
        }else{
            valoracion=1;
        }
        valoracion=valoracion+r.getRatioEmpleadosPlaza();
        
        if(valoracion>5){
            valoracion=5;
        }
        
        System.out.println("El restaurante tiene una valoracion de "+valoracion+" estrellas");
    }
}
