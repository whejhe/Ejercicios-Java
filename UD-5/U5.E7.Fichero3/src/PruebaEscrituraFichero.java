
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        int contador =1;
        List<String> lista = new ArrayList<>();
        
        System.out.println("Proceso de Escritura...(FIN para salir)");
        do{
            System.out.println("Frase "+contador+":");
            frase = sc.nextLine();
            if(!frase.equalsIgnoreCase("fin")){
                lista.add(frase);
                contador++;
            }
        }while(!frase.equalsIgnoreCase("fin"));
        System.out.println("Nombre Fichero: ");
        nombreFichero=sc.nextLine();
        
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
        
        EscrituraFichero f2 = new EscrituraFichero(nombreFichero);
        f2.abreEscribeCierra(lista);
        System.out.println("Frases guardadas correctamente");
    }
}
