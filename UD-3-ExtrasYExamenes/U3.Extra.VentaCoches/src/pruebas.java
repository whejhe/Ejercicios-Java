/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class pruebas {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("John","53276340T");
        Cliente c2 = new Cliente("Anne","83676240H");
        Cliente c3 = new Cliente("Tom","53236390G");
        
        Coche seat = new Coche("Seat","Ibiza","1234-IBZ");
        Venta v1 = new Venta("12-03-2001",12000,c1,seat);
        
        System.out.println("Cliente: "+v1.getCliente().getNombre());
        System.out.println("Marca y Modelo: "+v1.getCoche().getMarca()+"-"+v1.getCoche().getModelo());
        System.out.println("Matricula: "+v1.getCoche().getMatricula());
        System.out.println("Importe: "+v1.getImporte());
        System.out.println("Fecha de venta: "+v1.getFecha());
        
        System.out.println("");
        
        Coche opel = new Coche("Opel","Corsa","4321-COR");
        Venta v2 = new Venta("",9000,c2,opel);
        
        System.out.println("Cliente: "+v2.getCliente().getNombre());
        System.out.println("Marca y Modelo: "+v2.getCoche().getMarca()+"-"+v2.getCoche().getModelo());
        System.out.println("Matricula: "+v2.getCoche().getMatricula());
        System.out.println("Importe: "+v2.getImporte());
        System.out.println("Fecha de venta: "+v2.getFecha());
        
        System.out.println("");
        
        Coche seat2 = new Coche("Seat","Toledo","5678-TOL");
        Venta v3 = new Venta("",12900,c3,seat2);
        
        System.out.println("Cliente: "+v3.getCliente().getNombre());
        System.out.println("Marca y Modelo: "+v3.getCoche().getMarca()+"-"+v3.getCoche().getModelo());
        System.out.println("Matricula: "+v3.getCoche().getMatricula());
        System.out.println("Importe: "+v3.getImporte());
        System.out.println("Fecha de venta: "+v3.getFecha());
        
    }
}
