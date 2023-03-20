/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public interface MandoUniversalTV {
    
    void vincular(TelevisorPorControlRemoto tele);
    void desvincular();
    void encenderTV();
    void apagarTV();
    void setCanalTV (int numCanal);
    void subirCanalTV ();
    void bajarCanalTV ();
    void subirVolumenTV ();
    void bajarVolumenTV ();
}
