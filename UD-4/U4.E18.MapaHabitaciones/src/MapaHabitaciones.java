
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class MapaHabitaciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option;
        Map estadoHabitaciones = new HashMap();
        estadoHabitaciones.put(101, false);
        estadoHabitaciones.put(102, true);
        estadoHabitaciones.put(103, true);
        estadoHabitaciones.put(104, false);
        estadoHabitaciones.put(105, true);
        estadoHabitaciones.put(201, true);
        estadoHabitaciones.put(202, false);
        estadoHabitaciones.put(203, false);
        estadoHabitaciones.put(204, true);
        estadoHabitaciones.put(205, false);
        
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("0-Salir");
            System.out.println("1-Ver estado de ocupacion");
            System.out.println("2-Ocupar una habitacion");
            System.out.println("3-Liberar una habitacion");
            option=sc.nextInt();
            
            switch(option){
                case 0:
                    break;
                case 1:
                    Collection col = estadoHabitaciones.keySet();
                    Iterator iter = col.iterator();
                    while(iter.hasNext()){
                        int clave = (int)iter.next();
                        System.out.println(clave+":"+estadoHabitaciones.get(clave));
                    }
                    break;
                case 2:
                    System.out.println("¿Que habitacion quieres ocupar?");
                    estadoHabitaciones.replace(sc.nextInt(), true);
                    break;
                case 3:
                    System.out.println("¿Que habitacion quieres liberar?");
                    estadoHabitaciones.replace(sc.nextInt(), false);
                    break;
                default:
                    System.out.println("Opcion incorrecta, prueba otra vez");
                    break;
            }
        }while(option!=0);
        
    }
 
}
