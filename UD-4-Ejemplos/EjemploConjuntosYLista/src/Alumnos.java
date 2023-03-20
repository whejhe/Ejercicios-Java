/**
 *
 * @author domin
 */
import java.util.*;

public class Alumnos {

    public static void procesarAdmision(List<Solicitante> solicitantes, Set<Solicitante> admitidos, Set<Solicitante> excluidos) {
        for (Solicitante solicitante : solicitantes) {
            if (solicitante.cumpleRequisitos()) {
                admitidos.add(solicitante);
            } else {
                excluidos.add(solicitante);
            }
        }
    }

    public static class Solicitante {
        private String nombre;
        private int edad;
        private double notaMedia;

        public Solicitante(String nombre, int edad, double notaMedia) {
            this.nombre = nombre;
            this.edad = edad;
            this.notaMedia = notaMedia;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public double getNotaMedia() {
            return notaMedia;
        }

        public boolean cumpleRequisitos() {
            return edad >= 18 && notaMedia >= 7.0;
        }
    }
}
