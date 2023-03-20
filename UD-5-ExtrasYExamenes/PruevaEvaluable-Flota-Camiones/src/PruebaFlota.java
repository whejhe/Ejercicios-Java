/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaFlota {
    public static void main(String[] args) throws RevisionPendienteException, DepositoIncompletoException {
        
        try {
            Camion camionKmNegativos = new Camion("0000", true, true, -10);
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("------------------------------------------------");
        
        //Camion c1 = new Camion("A",true,true,0);
        Camion c1 = new Camion("A",true,true,500);
        Camion c2 = new Camion("B",true,true,500);
        Camion c3 = new Camion("C",true,true,1000);
        //Camion c3 = new Camion("C",true,false,1000);
        Camion c4 = new Camion("D",true,true,1500);
        //Camion c4 = new Camion("D",false,true,1500);
        Camion c5 = new Camion("E",true,true,1500);
        
        Flota f = new Flota();
        f.altaCamion(c1);
        f.altaCamion(c2);
        f.altaCamion(c3);
        f.altaCamion(c4);
        f.altaCamion(c5);
        
        f.imprimeFlota();
        System.out.println("--------------------------------------------");
        f.ponerFlotaEnRuta();
        
        
    }
}
