/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Pruebas {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("John","35476349F");
        Cliente c2 = new Cliente("Anne","85478349T");
        Cliente c3 = new Cliente("Tom","75456349V");
        Concesionario con1 = new Concesionario("Concesur","Q2826000H","41927");
        Concesionario con2 = new Concesionario("TuCoche","F3846800T","41920");
        Coche seat = new Coche("Seat","Ibiza","1234-IBZ",c1,con1);
        Coche opel = new Coche("Opel","Corsa","4321-COR",c2,con2);
        Coche toledo = new Coche("Seat","Toledo","5678-TOL",c3,con1);
        Coche meriva = new Coche("Opel","Meriva","8765-MER",c1,con2);
        
        System.out.println("Marca: "+seat.getMarca());
        System.out.println("Modelo: "+seat.getModelo());
        System.out.println("Matricula: "+seat.getMatricula());
        System.out.println("Propietario: "+seat.getCliente().getNombre());
        System.out.println("DNI: "+seat.getCliente().getDni());
        System.out.println("Cod. Postal: "+seat.getCliente().getDireccionPostal());
        System.out.println("Email: "+seat.getCliente().getEmail());
        System.out.println("Concesionario: "+seat.getConcesionario().getNombre());
        System.out.println("CIF: "+seat.getConcesionario().getCif());
        System.out.println("Cod.Postal: "+seat.getConcesionario().getDireccionPostal());
        System.out.println("Email: "+seat.getConcesionario().getEmail());
        System.out.println("");
        
        System.out.println("Marca: "+opel.getMarca());
        System.out.println("Modelo: "+opel.getModelo());
        System.out.println("Matricula: "+opel.getMatricula());
        System.out.println("Propietario: "+opel.getCliente().getNombre());
        System.out.println("DNI: "+opel.getCliente().getDni());
        System.out.println("Cod. Postal: "+opel.getCliente().getDireccionPostal());
        System.out.println("Email: "+opel.getCliente().getEmail());
        System.out.println("Concesionario: "+opel.getConcesionario().getNombre());
        System.out.println("CIF: "+opel.getConcesionario().getCif());
        System.out.println("Cod.Postal: "+opel.getConcesionario().getDireccionPostal());
        System.out.println("Email: "+opel.getConcesionario().getEmail());
        System.out.println("");
        
        System.out.println("Marca: "+toledo.getMarca());
        System.out.println("Modelo: "+toledo.getModelo());
        System.out.println("Matricula: "+toledo.getMatricula());
        System.out.println("Propietario: "+toledo.getCliente().getNombre());
        System.out.println("DNI: "+toledo.getCliente().getDni());
        System.out.println("Cod. Postal: "+toledo.getCliente().getDireccionPostal());
        System.out.println("Email: "+toledo.getCliente().getEmail());
        System.out.println("Concesionario: "+toledo.getConcesionario().getNombre());
        System.out.println("CIF: "+toledo.getConcesionario().getCif());
        System.out.println("Cod.Postal: "+toledo.getConcesionario().getDireccionPostal());
        System.out.println("Email: "+toledo.getConcesionario().getEmail());
        System.out.println("");
        
        System.out.println("Marca: "+meriva.getMarca());
        System.out.println("Modelo: "+meriva.getModelo());
        System.out.println("Matricula: "+meriva.getMatricula());
        System.out.println("Propietario: "+meriva.getCliente().getNombre());
        System.out.println("DNI: "+meriva.getCliente().getDni());
        System.out.println("Cod. Postal: "+meriva.getCliente().getDireccionPostal());
        System.out.println("Email: "+meriva.getCliente().getEmail());
        System.out.println("Concesionario: "+meriva.getConcesionario().getNombre());
        System.out.println("CIF: "+meriva.getConcesionario().getCif());
        System.out.println("Cod.Postal: "+meriva.getConcesionario().getDireccionPostal());
        System.out.println("Email: "+meriva.getConcesionario().getEmail());
        System.out.println("");
        
        
        
    }
}
