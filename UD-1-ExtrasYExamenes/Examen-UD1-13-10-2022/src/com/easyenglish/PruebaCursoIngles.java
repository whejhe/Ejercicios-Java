package com.easyenglish;

import com.easyenglish.courses.CursoIngles;

public class PruebaCursoIngles {

    public static void main(String[] args) {
        CursoIngles c = new CursoIngles();

        c.setNivelCurso("B1");
        c.setNumPlazasOfertadas(10);
        c.setCuotaMensual(59);

        c.altaAlumno();
        c.altaAlumno();
        c.altaAlumno();
        c.altaAlumno();
        c.altaAlumno();
        c.bajaAlumno();

        System.out.println("El curso de nivel " + c.getNivelCurso() + " tiene "
                + c.getNumPlazasOcupadas() + " plazas ocupadas y "
                + c.getNumPlazasOfertadas() + " plazas libres. Cuota Mensual= " + c.getCuotaMensual() + " euros");

        System.out.println("Si tienes un hermano en la academia la cuota mensual sería de " + c.calculaCuotaUnHermano() + " euros");
        System.out.println("Si tienes dos o más hermanos en la academia la cuota mensual sería de " + c.calculaCuotaDosOMasHermanos() + " euros");

    }
}
