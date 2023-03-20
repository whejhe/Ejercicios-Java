package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolista {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista();
        Futbolista f2 = new Futbolista();
        
        f1.setNombre("Leoned");
        f1.setApellidos("Messi");
        f1.setNumGoles(20);
        f1.setSalario(15);
        f1.seLesiona();
        f1.seRecupera();
        
        f2.setNombre("Cristiano");
        f2.setApellidos("Ronaldo");
        f2.setNumGoles(10);
        f2.setSalario(14);
        f2.seLesiona();
        
            
        System.out.println("Nombre: "+f1.getNombre());
        System.out.println("Apellido: "+f1.getApellidos());
        System.out.println("Goles Marcados: "+f1.getNumGoles());
        System.out.println("Salario por Temporada: "+f1.getSalario()+" Millones");
        System.out.println("Lesionado: "+f1.isLesionado());
        
        System.out.println("");
        
        System.out.println("Nombre: "+f2.getNombre());
        System.out.println("Apellido: "+f2.getApellidos());
        System.out.println("Goles Marcados: "+f2.getNumGoles());
        System.out.println("Salario por Temporada: "+f2.getSalario()+" Millones");
        System.out.println("Lesionado: "+f2.isLesionado());
    }
}
