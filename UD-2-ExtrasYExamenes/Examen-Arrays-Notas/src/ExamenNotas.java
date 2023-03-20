
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class ExamenNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        String alumnoBuscado="";
        double media = 0;
        int numAlumnos = 0;
        int pos=0;

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("0-Salir");
            System.out.println("1-Mostrar la nota media de los alumnos aprobados");
            System.out.println("2-Mostrar la nota de los alumnos suspensos");
            System.out.println("3-Mostrar todas las notas");
            System.out.println("4-Buscar Alumno");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    numAlumnos=0;
                    double total = 0;
                    for (int i = 0; i < Notas.nota.length; i++) {
                        if (Notas.nota[i] >= 5) {
                            System.out.print(Notas.nota[i] + " - ");
                            numAlumnos++;
                            total = total + Notas.nota[i];
                        }
                        media = total / numAlumnos;
                    }
                    System.out.println("");
                    System.out.println("La nota media de " + numAlumnos + " alumnos aprobados es " + media);
                    System.out.println("");
                    break;
                case 2:
                    numAlumnos=0;
                    for (int i = 0; i < Notas.nota.length; i++) {
                        for (int j = 0; j < Notas.nombres.length; j++) {
                            if (Notas.nota[i] < 5 && i==j) {
                                numAlumnos++;
                                System.out.println(numAlumnos + "-"+Notas.nombres[j]+"-"+Notas.nota[i]);
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    numAlumnos=0;
                    for(int i=0;i<Notas.nota.length;i++){
                        String valoracion;
                        if(Notas.nota[i]>=9){
                            valoracion="Sobresaliente";
                        }else if(Notas.nota[i]>=7 && Notas.nota[i]<9){
                            valoracion="Notable";
                        }else if(Notas.nota[i]>=6 && Notas.nota[i]<7){
                            valoracion="Bien";
                        }else if(Notas.nota[i]>=5 && Notas.nota[i]<6){
                            valoracion="Suficiente";
                        }else{
                            valoracion="Suspenso";
                        }
                        numAlumnos++;
                        System.out.println(numAlumnos+"-"+Notas.nombres[i]+"-"+Notas.nota[i]+"-"+valoracion);
                    }
                    System.out.println("");
                    break;
                case 4:
                    boolean encontrado=false;
                    System.out.println("¿Que Alumno quieres buscar?");
                    alumnoBuscado=sc.next();
                    for(int i=0;i<Notas.nombres.length;i++){
                        pos++;
                        if(Notas.nombres[i].equalsIgnoreCase(alumnoBuscado)){
                            System.out.println(Notas.nombres[i]+" se encuentra en la posicion "+pos+" con la nota: "+Notas.nota[i]);
                            encontrado=true;
                        }
                    }
                    if(encontrado==false){
                            System.out.println("Alumno no encontrado");
                        }
                    System.out.println("");
                    break;
                default:
                    while (option < 0 || option > 4) {
                        System.out.println("Opcion incorrecta, prueba otra vez");
                        option = sc.nextInt();
                    }
                    break;
            }
        } while (option != 0);

    }
}
