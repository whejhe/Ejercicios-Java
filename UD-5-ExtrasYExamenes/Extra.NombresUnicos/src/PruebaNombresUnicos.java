
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaNombresUnicos {

    public static void main(String[] args) {

        NombresUnicos n = new NombresUnicos();

        try {
            n.agregaNombre("Violeta");
            n.agregaNombre("Ricardo");
            n.agregaNombre("Ana");
            //n.agregaNombre("ana");
            n.agregaNombre("Juan");
        } catch (NombreDuplicadoException e) {
            System.out.println(e.getMessage());
        }

        n.imprimeNombre();
        System.out.println("-----------------");
        n.ordenaNombres();
        n.imprimeNombre();
        System.out.println("-----------------");
        n.contiene("juan");
    }
}
