
/**
 *
 * @author usuario
 */
public class PruebaCursos {
    public static void main(String[] args) {
        
        Curso c1 = new Curso("Curso 1",3);
        Curso c2 = new Curso("Curso 2",4);
        
        c1.agregarSolicitud(new Alumno("A",23,10));
        c1.agregarSolicitud(new Alumno("B",26,8));
        c1.agregarSolicitud(new Alumno("C",23,5));
        //c1.agregarSolicitud(new Alumno("C",23,5));
        c1.agregarSolicitud(new Alumno("D",19,6));
        //c1.adjudicarPlazas();
        c1.agregarSolicitud(new Alumno("E",21,6));
        c1.agregarSolicitud(new Alumno("F",31,6));
        c1.agregarSolicitud(new Alumno("G",24,5));
        
        c2.agregarSolicitud(new Alumno("C",23,5));
        c2.agregarSolicitud(new Alumno("D",19,6));
        c2.agregarSolicitud(new Alumno("F",31,6));
        c2.agregarSolicitud(new Alumno("G",24,5));
        c2.agregarSolicitud(new Alumno("H",35,9));
        
        c1.adjudicarPlazas();
        c2.adjudicarPlazas();
        System.out.println("----------------------------------------------");
        System.out.println("Admitidos del Curso 1: \n"+c1.getAdmitidos());
        System.out.println("Excluidos del Curso 1: \n"+c1.getExcluidos());
        
        System.out.println("---------------------------------------------");
        System.out.println("Admitidos del Curso 2: \n"+c2.getAdmitidos());
        System.out.println("Excluidos del Curso 2: \n"+c2.getExcluidos());
        
    }
}
