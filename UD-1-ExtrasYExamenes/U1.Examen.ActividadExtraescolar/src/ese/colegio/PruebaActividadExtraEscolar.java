package ese.colegio;

import java.util.Scanner;
import ese.colegio.actividades.ActividadExtraescolar;

public class PruebaActividadExtraEscolar {

    public static void main(String[] args) {
        ActividadExtraescolar act = new ActividadExtraescolar();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre de la Actividad");
        act.estableceNombreActividad(sc.next());
        System.out.println("Nivel: (Infantil,primaria,secundaria...)");
        act.estableceNivelActividad(sc.next());
        System.out.println("Importe mensual");
        act.estableceCuotaMensual(sc.nextInt());
        System.out.println("Numero de plazas ofertadas");
        act.estableceNumPlazasOfertadas(sc.nextInt());

        act.daAlta();
        act.daAlta();
        act.daAlta();
        act.daAlta();
        act.daAlta();
        act.daBaja();

        System.out.println("El nombre de la actividad es " + act.obtieneNombreActividad());
        System.out.println("Nivel: " + act.obtieneNivelActividad());
        System.out.println("Al precio de " + act.obtieneCuotaMensual() + " € al mes.");
        System.out.println("Numero de plazas ocupadas: " + act.obtieneNumPlazasOcupadas());
        System.out.println("Quedan libres " + act.obtieneNumPlazasOfertadas() + " plazas");

        System.out.println("con la bonificion del 20% serian "
                + (act.obtieneCuotaMensual() - act.calculaCuotaBonificada20()) + "€");
        System.out.println("con la bonificion del 80% serian "
                + (act.obtieneCuotaMensual() - act.calculaCuotaBonificada80()) + "€");

    }
}
