
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class PuertaUrbanizacion {

    private Map<Integer, Tarjeta> tarjetasPermitidas;
    private Set<Tarjeta> tarjetasDentro;

    public PuertaUrbanizacion() {
        tarjetasPermitidas = new HashMap<>();
        tarjetasDentro = new HashSet<>();
    }

    public void agregaTarjetaPermitida(Tarjeta t) {
        if (tarjetasPermitidas.containsKey(t.getIdentificador())) {
            System.out.println("Error, la tarjeta ya esta registrada");
        } else {
            tarjetasPermitidas.put(t.getIdentificador(), t);
            System.out.println("La tarjeta ha sido añadida con exito");
        }

    }

    public void eliminarTarjetaPermitida(int identificador) {
        if (tarjetasPermitidas.containsKey(identificador)) {
            tarjetasPermitidas.remove(identificador);
            System.out.println("La tarjeta ha sido eliminada con exito");
        } else {
            System.out.println("Error: La tarjeta que desea eliminar no esta registrada");
        }
    }

    public void imprimeTarjetasPermitidas() {
        if (tarjetasPermitidas.isEmpty()) {
            System.out.println("No hay ninguna targeta agregada al sistema");
        } else {
            System.out.println("Tarjetas Permitidas:");
            for (Map.Entry<Integer, Tarjeta> entry : tarjetasPermitidas.entrySet()) {
                Tarjeta t = entry.getValue();
                System.out.println("Identificador: " + t.getIdentificador() + ", Propietario: " + t.getNombrePropietario());
            }

        }
    }

    public void intentoDeEntrada(int identificador) {
        Tarjeta t = tarjetasPermitidas.get(identificador);
        if(tarjetasDentro.contains(t)){
            System.out.println("Error, esta tarjeta ya tiene un vehiculo registrado");
        }else if(t==null){
            System.out.println("Error,tarjeta no identificada");
        }else{
            tarjetasDentro.add(t);
            System.out.println("Puede ingresar a la urbanizacion");
        }
        
    }

    public void intentoDeSalida(int identificador) {
        Tarjeta t = tarjetasPermitidas.get(identificador);
        if(!tarjetasDentro.contains(t)){
            System.out.println("Error, ningun vehiculo ingreso con esta tarjeta");
        }else{
            tarjetasDentro.remove(t);
            System.out.println("Puede salir de la urbanizacion");
        }
    }


}
