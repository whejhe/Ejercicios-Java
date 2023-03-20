/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaMandoTV {
    public static void main(String[] args) {
        
        Televisor4K tv4k = new Televisor4K();
        TelevisorAntiguo antiguo = new TelevisorAntiguo();
        MandoUniversalChino m = new MandoUniversalChino();
        
        m.vincular(antiguo);
        m.setCanalTV(5);
        m.subirCanalTV();
        m.bajarVolumenTV();
        m.desvincular();
        m.subirCanalTV();
        
        System.out.println("----------------------------------------");
        
        m.vincular(tv4k);
        m.subirVolumenTV();
        m.setCanalTV(3);
        m.apagarTV();
        
        
    }
}
