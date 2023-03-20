
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author usuario
 */
public class Curso{
    private String nombre;
    private int numPlazas;
    private List solicitantes;
    private boolean admiteSolicitudes=true;
    private Set admitidos,excluidos;

    public Curso(String nombre, int numPlazas) {
        this.nombre = nombre;
        this.numPlazas = numPlazas;
        this.solicitantes = new ArrayList();
        this.admitidos = new HashSet();
        this.excluidos = new HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPlazas() {
        return numPlazas;
    }
    
    public void agregarSolicitud(Alumno a){
        if(admitidos.contains(a) || excluidos.contains(a) || solicitantes.contains(a)){
            System.out.println("Error, El alumno ya tiene una solicitud en curso");
        }else if(admiteSolicitudes==false){
            System.out.println("Error, no se admiten mas solicitudes");
        }else{
            solicitantes.add(a);
        }
    }
    
    public void adjudicarPlazas(){
        admiteSolicitudes=false;
        Collections.sort(solicitantes);
        Iterator iter = solicitantes.iterator();
        
        while(iter.hasNext()){
            Alumno elem = (Alumno)iter.next();
            if(admitidos.size()<numPlazas && !admitidos.contains(solicitantes)){
                System.out.println("Alumno Admitido "+elem.getDni());
                admitidos.add(elem);
            }else{
                System.out.println("Alumno Excluido "+elem.getDni());
                excluidos.add(elem);
            }
        }
        
    }

    public Set getAdmitidos() {
        System.out.println(admitidos.toString());
        return admitidos;
    }

    public Set getExcluidos() {
        System.out.println(excluidos.toString());
        return excluidos;
    }
    
    
    
    
    
    
}
