public class CajaCompleja {
    
    public double importeCliente;
    public int numArticulosClientes;
    public int numClientesAtendidos;
    public double importeTotalCaja;
    public int numArticulosVendidos;

    public void abrirCaja() {
        importeCliente = 0;
        numArticulosClientes = 0;
    }

    public void nuevoCliente() {
        numClientesAtendidos++;
        importeCliente = 0;
        numArticulosClientes = 0;
    }

    public void registrarArticulo(double precio) {
        numArticulosVendidos++;
        numArticulosClientes++;
        importeCliente = importeCliente + precio;
        importeTotalCaja = importeTotalCaja + precio;
    }
    public void anularArticulo(double precio){
        numArticulosClientes--;
        importeCliente =importeCliente - precio;
        importeTotalCaja= importeTotalCaja - precio;
        numArticulosVendidos--;
    }

    public void imprimirTicketCliente() {
        System.out.println("El cliente ha comprado " + numArticulosClientes
                + " articulos por un precio total de " + importeCliente + " euros");
    }
    
    public void imprimeCierreCaja(){
        System.out.println("Se han vendido un total de "+numArticulosVendidos
                +" articulos por un importe total de "+importeTotalCaja+" euros");
    }
    public double calculaPrecioMedioArticulosVendidos(){
        return importeTotalCaja/numArticulosVendidos;
    }
    public double calculaImporteMedioPorCliente(){
        return importeCliente/numArticulosClientes;
    }
    
}
