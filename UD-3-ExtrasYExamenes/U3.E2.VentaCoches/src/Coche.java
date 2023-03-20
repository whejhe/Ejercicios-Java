/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private String matricula;
    private Cliente cliente;
    private Concesionario concesionario;
    
    public Coche(String marca,String modelo,String matricula,Cliente cli,Concesionario con){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        cliente=cli;
        concesionario=con;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
    
    
    
    
}
