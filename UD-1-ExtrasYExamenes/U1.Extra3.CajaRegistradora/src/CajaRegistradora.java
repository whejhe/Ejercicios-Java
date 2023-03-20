
public class CajaRegistradora {

    public double importeCliente;
    public int numArticulosClientes;
    public boolean abrir;

    public void abrirCaja() {
        abrir = true;
        importeCliente = 0;
        numArticulosClientes = 0;
    }

    public void nuevoCliente() {
        importeCliente = 0;
        numArticulosClientes = 0;
    }

    public void registrarArticulo(double precio) {
        numArticulosClientes++;
        importeCliente = importeCliente + precio;
    }

    public void imprimirTicketCliente() {
        System.out.println("El cliente ha comprado " + numArticulosClientes
                + " articulos por un precio total de " + importeCliente + " euros");
    }
}
