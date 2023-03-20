
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaEscrituraFichero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombreFichero;
        String frase;
        
        try{
            
            System.out.println("Frase para el Fichero: ");
            frase = sc.nextLine();
            System.out.println("Nombre del Fichero: ");
            nombreFichero=sc.nextLine();
            
            EscrituraFichero f = new EscrituraFichero(nombreFichero);
            f.abrir();
            f.escribeTexto(frase);
            f.cerrar();
            
            System.out.println("Frase guardada en Fichero");
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
