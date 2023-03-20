/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaEdades {
    public static void main(String[] args) {
        
        Persona p = new Persona();
        
        p.setNombre("Pedro");
        p.setEdad(30);
        
        if(p.getEdad()>=0 && p.getEdad()<=3){
            System.out.println("Es un bebé");
        }else if(p.getEdad()>=4 && p.getEdad()<=12){
            System.out.println("Es un niño");
        }else if(p.getEdad()>=13 && p.getEdad()<=20){
            System.out.println("Es un adolescente");
        }else if(p.getEdad()>=21 && p.getEdad()<=130){
            System.out.println("Es un adulto");
        }else{
            System.out.println("La Edad no esta contemplada");
        }
        
    }
}
