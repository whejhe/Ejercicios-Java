/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class ServiciosAnimal {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tipo de animal:");
        a.setTipo(sc.nextLine());
        
        System.out.println("Edad del animal:");
        a.setEdad(sc.nextInt());
        
        System.out.println("Sexo (macho/hembra)");
        a.setSexo(sc.nextLine());
        
        System.out.println("¿Alguna Patologia? (true/false)");
        a.setPatologia(sc.nextBoolean());
        
        if(a.getTipo().equalsIgnoreCase("perro") && a.isPatologia()==false && a.getEdad()>1){
            System.out.println("Se ha contratado el servicio de peluquería");
        }else if((a.getEdad()>=0 && a.getEdad()<=1) && a.getTipo().equalsIgnoreCase("gato") && (a.isPatologia()==false) || a.getSexo().equalsIgnoreCase("hembra")){
            System.out.println("Se ha contratado el servicio de Guarderia felina");
        }else if(a.getEdad()>1 && a.isPatologia()==true || (a.getTipo().equalsIgnoreCase("hamster")) && a.getSexo().equalsIgnoreCase("hembra")){
            System.out.println("Se ha contratado el servicio de Ecografia");
        }else{
            System.out.println("Se ha contratado el servicio de Medicina");
        }
    }
}
