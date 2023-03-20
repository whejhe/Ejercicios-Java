
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Flota {
    
    private Set<Camion> flota;

    public Flota() {
        flota = new HashSet<>();
    }
    
    public void altaCamion(Camion c){
        if(c==null){
            throw new NullPointerException("El camion no puede ser nulo");
        }
        flota.add(c);
    }
    
    public boolean contieneCamion(Camion c){
        if(flota.contains(c)){
            return true;
        }else{
            System.out.println("El camion no pertenece a la flota");
            return false;
        }
    }
    
    public boolean bajaCamion(Camion c){
        if(flota.contains(c)){
            flota.remove(c);
            return true;
        }else{
            System.out.println("El camion no pertenece a la flota");
            return false;
        }
    }
    
    public void imprimeFlota(){
        Iterator<Camion> iter = flota.iterator();
        int contador=1;
        while(iter.hasNext()){
            System.out.println(contador+"-"+iter.next());
            contador++;
        }
    }
    
    public void ponerFlotaEnRuta() throws RevisionPendienteException, DepositoIncompletoException{
        Iterator<Camion> iter = flota.iterator();
        while(iter.hasNext()){
            Camion c = iter.next();
            try{
                c.realizaRuta();
                System.out.println("En ruta: "+c);
            }catch(IllegalStateException e){
                System.out.println("No puede hacer ruta: "+c);
            }
            
        }
    }
    
    
}
