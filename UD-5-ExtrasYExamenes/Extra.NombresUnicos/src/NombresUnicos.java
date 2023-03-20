
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class NombresUnicos{
    
    private List<String> lista;

    public NombresUnicos() {
        lista = new ArrayList();
    }
    
    public void agregaNombre(String nombre)throws NombreDuplicadoException{
        String primeraLetra = nombre.substring(0, 1).toUpperCase();
        String restoNombre = nombre.substring(1).toLowerCase();
        nombre=primeraLetra+restoNombre;
        if(lista.contains(nombre)){
            throw new NombreDuplicadoException("La lista no puede tener nombres repetidos");
        }else{
            lista.add(nombre);
        }
    }
    
    
    public void ordenaNombres(){
        Collections.sort(lista);
    }
    
    public void imprimeNombre(){
        Iterator<String> iter = lista.iterator();
        int contador =1;
        while(iter.hasNext()){
            System.out.println(contador+". "+iter.next());
            contador++;
        }
    }
    
    public boolean contiene(String nombre){
        String primeraLetra = nombre.substring(0, 1).toUpperCase();
        String restoNombre = nombre.substring(1).toLowerCase();
        nombre=primeraLetra+restoNombre;
        if(lista.contains(nombre)){
            System.out.println("Si,"+nombre+" pertenece a la lista");
            return true;
        }else{
            System.out.println("Nombre no encontrado");
            return false;
        }
    }
    /*public boolean contiene(String nombre) { 
        for (String elem : lista) {
            if(elem.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }*/
    
    
}
