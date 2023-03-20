/**
 *
 * @author NoBody
 */
import java.util.Scanner;

public class BuscaMatriculas {
    public static void main(String[] args) {
        
        String[] matricula = {"5432-FNT", "9823-TRH", "3451-LPU", "1937-YHN", "8474-PMG", "8183-TGF", "0293-SDR"};
        Scanner sc = new Scanner(System.in);
        String matriculaBuscada;
        //boolean encontrado=false;
        
        System.out.println("Introduce tu matricula");
        matriculaBuscada=sc.nextLine();
        
        for(int i=0;i<matricula.length;i++){
            if(matricula[i].equalsIgnoreCase(matriculaBuscada)){
                System.out.println("Llama a la Poli");
                //encontrado=true;
                break;
            }else if(i==matricula.length-1){
                System.out.println("Matricula no encontrada");
            }
        }
        /*if(!encontrado){
            System.out.println("Matricula no encontrada");
        }*/
        
    }
}
