package com.hoteles;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
import java.util.Scanner;

public class ClasificadorHoteles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel h = new Hotel();

        System.out.println("¿A que distancia se encuentra el Hotel del Centro?");
        h.setDistCentro(sc.nextDouble());

        System.out.println("¿Cuantos idiomas maneja la recepción?");
        h.setNumIdiomas(sc.nextInt());

        System.out.println("¿Tiene piscina?");
        h.setConPiscina(sc.nextBoolean());

        System.out.println("¿Abre las 24h?");
        h.setAbierta24h(sc.nextBoolean());

        if (h.getDistCentro() < 1 && h.getNumIdiomas() >= 4 && h.isAbierta24h() == true && h.isConPiscina() == true) {
            System.out.println("El hotel es de la categoria Superior");
        } else if (h.getDistCentro() >= 1 && h.getDistCentro() <= 3 && h.getNumIdiomas() >= 4 && (h.isAbierta24h() == true || h.isConPiscina() == true)) {
            System.out.println("El hotel es de la categoria Intermedia");
        } else if (h.getDistCentro() >= 3.1 && h.isAbierta24h() == true && h.isConPiscina() == true && h.getNumIdiomas() >= 4) {
            System.out.println("El hotel es de la categoria básica");
        } else {
            System.out.println("El hotel pertenece a la categoria económica");
        }

    }
}
