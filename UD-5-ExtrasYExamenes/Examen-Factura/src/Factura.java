
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Factura {

    private List<Producto> productos;
    private String fechaFactura;

    public Factura(String fechaFactura) {
        if (fechaFactura == null) {
            throw new NullPointerException("FechaFactura no puede ser nula");
        }
        if (fechaFactura.equals("")) {
            throw new IllegalArgumentException("FechaFactura no puede ser una cadena vacia");
        }
        this.fechaFactura = fechaFactura;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (p == null) {
            throw new NullPointerException("El producto no puede ser nulo");
        }
        productos.add(p);
        Collections.sort(productos);
    }

    public double calcularImporteTotal() {
        double total = 0;
        if (productos.isEmpty()) {
            return 0;
        }
        Iterator<Producto> iter = productos.iterator();
        while (iter.hasNext()) {
            Producto p = iter.next();
            total = total + p.getPrecio();
        }
        return total;
    }

    public double calculaImporteCategoria(String categoria) {
        double total = 0;
        Iterator<Producto> iter = productos.iterator();
        while (iter.hasNext()) {
            Producto p = iter.next();
            if (categoria.equalsIgnoreCase(p.getCategoria())) {
                total = total + p.getPrecio();
            }
        }
        return total;
    }

    public void imprimeFactura() {
        System.out.println("FACTURA CON FECHA " + fechaFactura);
        if (productos.isEmpty()) {
            System.out.println("No hay productos asociados a la factura");
        } else {
            Iterator<Producto> iter = productos.iterator();
            String categoriaActual="";
            while (iter.hasNext()) {
                Producto p = iter.next();
                if(!categoriaActual.equalsIgnoreCase(p.getCategoria())){
                    categoriaActual=p.getCategoria();
                    System.out.println("CATEGORIA: "+p.getCategoria());
                }
                System.out.println("-"+p.getNombre()+": "+p.getPrecio()+" €");
            }
            System.out.println("IMPORTE DE LA FACTURA "+calcularImporteTotal()+" €");
        }
    }
}
