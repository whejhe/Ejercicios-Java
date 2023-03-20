package es.tuespiral.u4.e20.concesionariovehiculos;

public class PruebaConcesionario {
    public static void main(String[] args) {
        Concesionario con = new Concesionario("Concesur", "Calle concesionarios 2");
        
        Vehiculo v1 = new Vehiculo("Volvo", "S40", "1234-FRT", 2010, 12000);
        Vehiculo v2 = new Vehiculo("Fiat", "Punto", "4321-TRW", 2020, 14000);
        Vehiculo v3 = new Vehiculo("Seat", "Ibiza", "1987-RSQ", 2019, 10000);
        
        con.agregaVehiculo(v1);
        con.agregaVehiculo(v2);
        con.agregaVehiculo(v3);
        
        con.muestraVehiculos();
        v3.setPrecio(10999);
        con.actualizaVehiculo(v3);
        System.out.println("-------");
        
        System.out.println("Tras modificar el precio del Seat");
        con.muestraVehiculos();
        
        System.out.println("Importe total de los vehículos del concesionario: "+con.calculaSumaPrecioVehiculos());
        System.out.println("-------");
        
        System.out.println("Borramos el Seat");
        con.borraVehiculo(v3);
        con.muestraVehiculos();
        
    }
}
