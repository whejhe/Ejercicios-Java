/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaArrayPersonas {
    public static void main(String[] args) {
        
        Persona[] Familia = new Persona[4];
                
        Familia[0]=new Persona();
        Familia[0].setRol("Padre");
        Familia[0].setEdad(43);
        
        Familia[1]=new Persona();
        Familia[1].setRol("Madre");
        Familia[1].setEdad(40);
        
        Familia[2]=new Persona();
        Familia[2].setRol("Hijo");
        Familia[2].setEdad(24);
        
        Familia[3]=new Persona();
        Familia[3].setRol("Hija");
        Familia[3].setEdad(14);
        
        for(int i=0;i<4;i++){
            System.out.println("La posicion "+i+" la ocupa el "+Familia[i].getRol()+" con "+Familia[i].getEdad()+" años");
        }
        
       Familia[2]=new Persona();
       //Familia[2].setRol("");
       //Familia[2].setEdad(0);
       for(int i=2;i<3;i++){
            System.out.println("La posicion "+i+" la ocupa el "+Familia[i].getRol()+" con "+Familia[i].getEdad()+" años");
        }
       
       Familia[2].setRol("Abuelo");
       Familia[2].setEdad(80);
       for(int i=2;i<3;i++){
            System.out.println("La posicion "+i+" la ocupa el "+Familia[i].getRol()+" con "+Familia[i].getEdad()+" años");
        }
       
       
       
    }
}
