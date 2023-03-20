package com.mifutbol.app;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PosesionBalon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] tiempo = {180, 120, 90, 180, 120, 120, 120, 240, 78, 270, 180, 120, 120,
            180, 204, 420, 360, 420, 480, 300, 120, 180, 600, 258};
        int option=0;
        String equipo="";
        double suma=0;
        double tiempoLocal=0;
        double tiempoVisitante=0;
        double tiempoTotal=0;
        double tiempoPosesion=0;
        boolean encontrado=false;
        
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("0-Salir");
            System.out.println("1-Listar posesiones del partido");
            System.out.println("2 – Mostrar la duración media de la posesión del balón");
            System.out.println("3 – Mostrar los totales de posesión");
            System.out.println("4 – Buscar la primera posesión con más de X segundos de duración");
            System.out.println("5 – Buscar todas las posesiones con más de X segundos de duración");
            
            System.out.println("");
            System.out.println("Elige una opción");
            option=sc.nextInt();
           
            switch(option){
                case 0:
                    System.out.println("Hasta la vista");
                    break;
                case 1:
                    suma=0;
                    for(int i=0;i<tiempo.length;i++){
                        suma=suma+tiempo[i];
                        double aMinutos=tiempo[i]/60;
                        if(i%2==0){
                            equipo="Local";
                        }else{
                            equipo="Visitante";
                        }
                        System.out.println(aMinutos+" minutos del equipo "+equipo);
                    }
                    System.out.println("Se han jugado un total de "+suma/60+" minutos");
                    System.out.println("");
                    break;
                case 2:
                    tiempoVisitante=0;
                    tiempoLocal=0;
                    for(int i=0;i<tiempo.length;i++){
                        if(i%2==0){
                            tiempoLocal=tiempoLocal+tiempo[i];
                        }else{
                            tiempoVisitante=tiempoVisitante+tiempo[i];
                        }
                    }
                    System.out.println("Duración media de la posesión del balón");
                    System.out.println("-Equipo local "+(tiempoLocal/60)/12+" minutos");
                    System.out.println("-Equipo visitante "+(tiempoVisitante/60)/12+" minutos");
                    System.out.println("");
                    break;
                case 3:
                     tiempoLocal=0;
                     tiempoVisitante=0;
                     tiempoTotal=0;
                     for(int i=0;i<tiempo.length;i++){
                         tiempoTotal=tiempoTotal+tiempo[i];
                         if(i%2==0){
                             tiempoLocal=tiempoLocal+tiempo[i];
                         }else{
                             tiempoVisitante=tiempoVisitante+tiempo[i];
                         }
                     }
                     System.out.println("Minutos de posesión del balon:");
                     System.out.println("-Equipo local "+tiempoLocal/60+" minutos");
                     System.out.println("-Equipo visintate "+tiempoVisitante/60+" minutos");
                     System.out.println("Porcentaje de posesión del balón:");
                     System.out.println("-Equpo Local "+(tiempoLocal*100)/tiempoTotal);
                     System.out.println("-Equipo visitante "+(tiempoVisitante*100)/tiempoTotal);
                     System.out.println("");
                    break;
                case 4:
                    tiempoLocal=0;
                    tiempoVisitante=0;
                    System.out.println("Dime el tiempo de posesion a buscar");
                    tiempoPosesion=sc.nextDouble();
                    for(int i=0;i<tiempo.length;i++){
                        if(tiempoPosesion<=tiempo[i]){
                            encontrado=true;
                            System.out.println("Primera posesión que supera los "+(int)tiempoPosesion+" segundos:");
                            if(i%2==0){
                                equipo="Local";
                            }else{
                                equipo="Visitante";
                            }
                            System.out.println("-Equipo "+equipo+" con "+(int)tiempo[i]+" segundos");
                            break;
                        }
                    }
                    if(encontrado==false){
                        System.out.println("Ninguno de los equipos ha superado los "+tiempoPosesion+" segundos de posesión");
                    }
                    break;
                case 5:
                    tiempoLocal=0;
                    tiempoVisitante=0;
                    encontrado=false;
                    System.out.println("Dime el numero de segundos de posesion");
                    option=sc.nextInt();
                    System.out.println("Las posesiones que superan "+option+" segundos son:");
                    for(int i=0;i<tiempo.length;i++){
                        if(tiempo[i]>option && i%2==0){
                            encontrado=true;
                            System.out.println("Equipo Local con "+(int)tiempo[i]+" segundos");
                        }else if(tiempo[i]>option && i%2!=0){
                            encontrado=true;
                            System.out.println("Equipo Visitante con "+(int)tiempo[i]+" segundos");
                        }
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            
        }while(option!=0);
        
    }
}
