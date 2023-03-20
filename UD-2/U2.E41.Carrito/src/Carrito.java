
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Carrito {

    public int numArticulos;
    public boolean inicializado = false;
    public Articulo[] miCarrito;

    public void inicializaCarrito(int numPosiciones) {
        miCarrito = new Articulo[numPosiciones];
        inicializado = true;
        numArticulos=0;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void guardaArticulo(Articulo nuevoArtic) {
        if (inicializado == false) {
            System.out.println("ERROR: carrito aún no inicializado");
        } else if (numArticulos == miCarrito.length) {
            System.out.println("ERROR: carrito lleno");
        } else if (nuevoArtic == Articulo.getNOT_FOUND()) {
            System.out.println("ERROR: no se puede guardar la marca de NO ENCONTADO");
        } else {
            miCarrito[numArticulos] = nuevoArtic;
            numArticulos++;
        }
    }

    public void muestraArticulos() {
        if (numArticulos == 0) {
            System.out.println("No hay articulos en el carrito");
        } else if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            for (int i = 0; i < numArticulos; i++) {
                System.out.println("Id=" + miCarrito[i].getIdArticulo()
                        + ",nombre=" + miCarrito[i].getNombre()
                        + ",precio=" + miCarrito[i].getPrecio());
            }
        }
    }

    public Articulo buscaArticuloPorId(int idABuscar) {
        Articulo resultado;
        resultado = Articulo.getNOT_FOUND();
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            for (int i = 0; i < numArticulos; i++) {
                if (idABuscar == miCarrito[i].getIdArticulo()) {
                    System.out.println("Id=" + miCarrito[i].getIdArticulo()
                            + ",nombre=" + miCarrito[i].getNombre()
                            + ",precio=" + miCarrito[i].getPrecio());
                    break;
                }
            }
        }

        return resultado;
    }

    public double getPrecioTotalCarrito() {
        double Total = 0.0;
        if (numArticulos == 0) {
            System.out.println(Total);
        } else if (inicializado == false) {
            System.out.println("Error: carrito aún no inicializado");
            Total=-1.0;
            return Total;
        } else {
            for (int i = 0; i < numArticulos; i++) {
                Total = Total + miCarrito[i].getPrecio();
            }
            return Total;

        }
        return Total;
    }
}
