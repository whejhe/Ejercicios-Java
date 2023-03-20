package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaFutbolista {
    public static void main(String[] args) {
        
        Futbolista f = new Futbolista("Fran","Garcia");
        
        
        System.out.println(f.getNombre()+" "+f.getApellidos());
        f.setSalario(5000);
        System.out.println("Sueldo: "+f.getSalario()+"€");
        f.setNumGoles(10);
        f.setLesionado(false);
        System.out.println("Goles Marcados: "+f.getNumGoles());
        
        System.out.println("");
        
        f.marcaGol();
        f.marcaGool(4);
        f.golAnulado();
        f.golAnulado(20);
        System.out.println("");
        f.golAnulado(10);
        
        System.out.println(f.getNombre()+" "+f.getApellidos());
        f.setSalario(5000);
        System.out.println("Sueldo: "+f.getSalario()+"€");
        System.out.println("Goles Marcados: "+f.getNumGoles());
        
        
    }
}
