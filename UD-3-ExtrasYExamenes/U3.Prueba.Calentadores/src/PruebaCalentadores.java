/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaCalentadores {
    public static void main(String[] args) {
        
        Radiador r = new Radiador();
        Secador s = new Secador();
        
        r.setPotenciaMax(1000);
        s.setPotenciaMax(1000);
        
        r.porcentajePotencia(80);
        System.out.println("Potencia Actual: "+r.calculaPotenciaActual());
        r.encender();
        r.setPotenciaMax(1000);
        r.porcentajePotencia(80);
        System.out.println("Potencia Actual: "+r.calculaPotenciaActual());
        
        System.out.println("-----------------------------------");
        
        System.out.println(s.getPotenciaActual());
        s.encender();
        s.setPotenciaMax(1000);
        
        s.encenderResistencia1();
        System.out.println(s.getPotenciaActual());
        
        s.encenderResistencia2();
        System.out.println(s.getPotenciaActual());
        
  
        
    }
}
