/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaPersonaCoche {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Juan","53276349T");
        Vehiculo citroen = new Vehiculo();
        Vehiculo Seat = new Vehiculo();
        Vehiculo Mercedes = new Vehiculo();
        Vehiculo Renault = new Vehiculo();
        
        p1.comprarCoche(citroen);
        p1.comprarCoche(Seat);
        System.out.println(p1.getNombre()+" con DNI:"+p1.getDni()+" actualmente tiene "+p1.getNumCochesActual()+" coches");
        p1.arrancarCoche(citroen);
        p1.arrancarCoche(Seat);
        p1.recorrerDistancia(citroen, 100);
        p1.recorrerDistancia(Seat, 80);
        p1.apagarCoche(citroen);
        p1.apagarCoche(Seat);
        p1.reponerCombustible(citroen, 50);
        p1.reponerCombustible(Seat, 50);
        System.out.println("Numero de coches actual: "+p1.getNumCochesActual());
        
        System.out.println("");
        System.out.println("Compramos otro coche");
        p1.comprarCoche(Mercedes);
        System.out.println("Numero de coches actual: "+p1.getNumCochesActual());
        
        System.out.println("");
        System.out.println("Compramos uno más"); 
        p1.comprarCoche(Renault);
        System.out.println("Numero de coches actual: "+p1.getNumCochesActual());
        
        
    }
}
