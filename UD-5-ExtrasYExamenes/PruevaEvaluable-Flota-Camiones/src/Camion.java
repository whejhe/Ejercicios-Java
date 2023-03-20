
import java.util.Objects;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Camion {
    
    private String matricula;
    private boolean revisionPasada;
    private boolean depositoCompleto;
    private int kmRecorridos;

    public Camion(String matricula, boolean revisionPasada, boolean depositoCompleto, int kmRecorridos) {
        if(matricula==null){
            throw new NullPointerException("La matricula no puede ser nula");
        }
        if(kmRecorridos<0){
            throw new IllegalArgumentException("Los km recorridos no pueden ser negativos");
        }
        this.matricula = matricula;
        this.revisionPasada = revisionPasada;
        this.depositoCompleto = depositoCompleto;
        this.kmRecorridos = kmRecorridos;
    }
    
    public void llenaDeposito(){
        depositoCompleto=true;
    }
    
    public void realizaRuta() throws RevisionPendienteException, DepositoIncompletoException{
        if(revisionPasada==true && depositoCompleto==true){
            kmRecorridos=kmRecorridos+500;
        }else if(revisionPasada==false){
            throw new RevisionPendienteException("No has pasado la revision, no puedes realizar la ruta");
        }else{
            throw new DepositoIncompletoException("No tienes conbustible para realizar la ruta");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Camion{" + "matricula=" + matricula + ", revisionPasada=" + revisionPasada + ", depositoCompleto=" + depositoCompleto + ", kmRecorridos=" + kmRecorridos + '}';
    }
    
    
}
