
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Articulos{
    
    List<Articulo> listaArt;
    
    public Articulos(){
        listaArt=new ArrayList();
    }
    
    public void agregarArticulo(Articulo a){
        listaArt.add(a);
    }
    
    public boolean contieneArticulo(Articulo a){
        if(listaArt.contains(a)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean borraArticulo(Articulo a){
        if(listaArt.contains(a)){
            listaArt.remove(a);
            return true;
        }else{
            return false;
        }
    }
    
    public void imprimeArticulos(){
        if(listaArt.isEmpty()){
            System.out.println("No hay artículos que mostrar");
        }else{
            System.out.println(listaArt.toString());
        }
    }
    
    public void ordenaArticulos(){
        Collections.sort(listaArt);
    }
    
    public double calculaTotalArticulo(){
        Iterator<Articulo> iter = listaArt.iterator();
        double total=0;
        while(iter.hasNext()){
            Articulo a = iter.next();
            total=total+a.getPrecio();
        }
        System.out.println("Total Precio: "+total);
        return total;
    }
    
}
