
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PuertaUrbanizacion{

    private Map<Integer, Tarjeta> tarjetasPermitidas = new HashMap();
    private Set<Tarjeta> tarjetasDentro = new HashSet();

    public PuertaUrbanizacion() {

    }

    public void agregarTarjetaPermitida(Tarjeta t) {
        if (!tarjetasPermitidas.containsKey(t.getIdentificador())) {
            tarjetasPermitidas.put(t.getIdentificador(), t);
            System.out.println("Tarjeta permitida: "+t.getIdentificador()+"-"+t.getNombrePropietario());
        } else {
            System.out.println("La tarjeta ya esta registrada,no puedes entrar");
        }
    }

    public void eliminarTarjetaPermitida(int identificador) {
        if (tarjetasPermitidas.containsKey(identificador)) {
            tarjetasPermitidas.remove(identificador);
            System.out.println("La tajeta con identificador "+identificador+" ha sido removida del registro");
        } else {
            System.out.println("La tarjeta no se encuentra en el sistema, no puede ser removida");
        }
    }

    public void imprimeTarjetasPermitidas() {
        if (tarjetasPermitidas.isEmpty()) {
            System.out.println("No hay tarjetas permitidas en el sistema.");
        } else {
            System.out.println("Tarjetas Permitidas: "+tarjetasPermitidas.toString());
        }

    }

    public void intentoDeEntrar(int identificador) {
        if(tarjetasDentro.contains(identificador)){
            System.out.println("No puedes pasar,tarjeta registrada");
        }else{
            System.out.println("Puedes pasar");
        }
    }

    public void intentoDeSalida(int identificador) {
        if(tarjetasDentro.contains(identificador)){
            System.out.println("Puedes Salir");
        }else{
            System.out.println("No puedes salir, tarjeta no registrada");
        }
        
    }

}
