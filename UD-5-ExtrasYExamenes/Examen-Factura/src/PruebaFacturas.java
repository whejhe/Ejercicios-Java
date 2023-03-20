/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaFacturas {
    public static void main(String[] args) {
        
        try{
            //Producto p = new Producto("","",-10);
            Producto p2 = new Producto("Hogar","Lavadora",-10);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Factura f = new Factura("");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        try{
            Factura f = new Factura("12/03/2022");
            f.agregarProducto(new Producto ("Hogar","Frigorífico",400));
            f.agregarProducto(new Producto ("Hogar","Lavavajillas",350));
            f.agregarProducto(new Producto ("Hogar","Lavadora",300));
            f.agregarProducto(new Producto ("Tecnologia","Impresora",120));
            f.agregarProducto(new Producto ("Tecnologia","Router",50));
            
            f.imprimeFactura();
            System.out.println("Importe categoria Hogar: "+f.calculaImporteCategoria("Hogar")+"€");
            System.out.println("Importe categoria Tecnologia: "+f.calculaImporteCategoria("Tecnologia")+"€");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
