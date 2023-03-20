/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class TelevisorAntiguo implements TelevisorPorControlRemoto{
    
    private boolean encendido;
    private int numCanal;
    private int volumen;
    private final int canalMax = 99;
    private final int canalMin = 1;
    private final int volumenMax = 99;
    private final int volumenMin = 0;

    @Override
    public void encender() {
        System.out.println("TelevisorAntiguo se enciende");
        encendido=true;
    }

    @Override
    public void apagar() {
        System.out.println("TelevisorAntiguo  se apaga");
        encendido=false;
    }

    @Override
    public void setCanal(int numCanal) { 
        this.numCanal=numCanal;
        if(numCanal<=canalMin){
            numCanal=1;
        }
        System.out.println("TelevisorAntiguo cambia al canal "+numCanal);
    }

    @Override
    public void subirCanal() {
        numCanal++;
        if(numCanal>canalMax){
            numCanal=1;
        }
        System.out.println("TelevisorAntiguo sube al canal "+numCanal);
    }

    @Override
    public void bajarCanal() {
        numCanal--;
        if(numCanal<canalMin){
            numCanal=99;
        }
        System.out.println("TelevisorAntiguo  baja al canal "+numCanal);
    }

    @Override
    public void subirVolumen() {
        volumen++;
        if(volumen>volumenMax){
            volumen=volumenMax;
        }
        System.out.println("TelevisorAntiguo sube volumen al "+volumen);
    }

    @Override
    public void bajarVolumen() {
        volumen--;
        if(volumen<volumenMin){
            volumen=volumenMin;
        }
        System.out.println("TelevisorAntiguo baja volumen al "+volumen);
    }
    

}
