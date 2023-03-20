public class PruebaCajaCompleja {
    public static void main(String[] args) {
        
        CajaCompleja caja = new CajaCompleja();
        
        caja.abrirCaja();
        caja.nuevoCliente();
        caja.registrarArticulo(12.95);
        caja.registrarArticulo(2.48);
        caja.registrarArticulo(20.06);
        caja.anularArticulo(2.48);
        caja.imprimirTicketCliente();
        System.out.println("Precio medio Articulos Cliente: "+caja.calculaImporteMedioPorCliente());
        System.out.println("");
        
        caja.nuevoCliente();
        caja.registrarArticulo(5.95);
        caja.registrarArticulo(2.48);
        caja.registrarArticulo(2.48);
        caja.registrarArticulo(7.88);
        caja.imprimirTicketCliente();
        System.out.println("Precio medio Articulos Cliente: "+caja.calculaImporteMedioPorCliente());
        System.out.println("");
        
        caja.imprimeCierreCaja();
        System.out.println("Precio medio Articulos Cliente: "+caja.calculaPrecioMedioArticulosVendidos());
        
    }
}
