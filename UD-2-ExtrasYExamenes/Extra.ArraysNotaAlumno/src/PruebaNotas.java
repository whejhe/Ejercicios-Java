/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class PruebaNotas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Notas[] nota=new Notas[10];
        Double Total=0.0;
        
        nota[0]=new Notas();
        nota[0].setNombreAlumno("Julio");
        
        nota[1]=new Notas();
        nota[1].setNombreAlumno("Maria");
        
        nota[2]=new Notas();
        nota[2].setNombreAlumno("Antonio");
        
        nota[3]=new Notas();
        nota[3].setNombreAlumno("Violeta");
        
        nota[4]=new Notas();
        nota[4].setNombreAlumno("Julio");
        
        nota[5]=new Notas();
        nota[5].setNombreAlumno("Pedro");
        
        nota[6]=new Notas();
        nota[6].setNombreAlumno("Antonio");
        
        nota[7]=new Notas();
        nota[7].setNombreAlumno("Carmen");
        
        nota[8]=new Notas();
        nota[8].setNombreAlumno("Ana");
        
        nota[9]=new Notas();
        nota[9].setNombreAlumno("Sara");
        
        for(int i=0;i<nota.length;i++){
            System.out.println("Dime la nota de "+nota[i].getNombreAlumno());
            nota[i].setNotas(sc.nextDouble());
            Total=Total+nota[i].getNotas();
        }
        
        for(int i=0;i<nota.length;i++){
            System.out.println(nota[i].getNombreAlumno()+": "+nota[i].getNotas());
        }
        
        System.out.println("La media aritmetica es "+Total/10);
        
    }
}
