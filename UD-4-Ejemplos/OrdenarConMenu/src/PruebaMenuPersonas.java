
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PruebaMenuPersonas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List personas = new ArrayList();

        int contador=5;
        int opcion;
        int edad;
        String nombre, apellido;
        boolean conTrabajo;
        Persona p;
        personas.add(new Persona(22,"Ana","Fernandez",false));
        personas.add(new Persona(35,"Juan","de la Rosa",true));
        personas.add(new Persona(20,"Antonio","Dominguez",false));
        personas.add(new Persona(32,"Sandra","Alacid",true));
        personas.add(new Persona(42,"Carlos","Fernandez",false));
        
        
        /*--------------------------------------------------------------------*/
        System.out.println("Introduce los datos del cliente");
        System.out.println("Edad,Nombre,Apellido,ConTrabajo(true/false)");
        edad = sc.nextInt();
        nombre = sc.next();
        apellido = sc.next();
        conTrabajo = sc.nextBoolean();
        p = new Persona(edad, nombre, apellido, conTrabajo);
        personas.add(contador,p);
        /*--------------------------------------------------------------------*/
        do {
            System.out.println("Quieres introducir a alguien más en la lista (0-Salir) (1-New Cliente)");
            opcion=sc.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    contador++;
                    System.out.println("Introduce los datos del cliente");
                    edad = sc.nextInt();
                    nombre = sc.next();
                    apellido = sc.next();
                    conTrabajo = sc.nextBoolean();
                    p = new Persona(edad, nombre, apellido, conTrabajo);
                    personas.add(contador,p);//añade persona a la siguiente posicion de la lista
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 0);

        
        System.out.println("¿Como quieres ordenar tu lista?");
        System.out.println("1-Edad / 2-Edad Descentente / 3-Nombre / 4-Apellido / 5-Estado Laboral");
        opcion=sc.nextInt();
        switch(opcion){
            case 1:
                Persona.valor=1;
                break;
            case 2:
                Persona.valor=2;
                break;
            case 3:
                Persona.valor=3;
                break;
            case 4:
                Persona.valor=4;
                break;
            case 5:
                Persona.valor=5;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        Collections.sort(personas);
        System.out.println("Lista de Clientes");
        Iterator iter = personas.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(personas.toString());
        
        

    }
}
