/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class MandoUniversalChino implements MandoUniversalTV{
    
    private TelevisorPorControlRemoto control;

    @Override
    public void vincular(TelevisorPorControlRemoto tele) {
        control=tele;
    }

    @Override
    public void desvincular() {
        control=null;
    }

    @Override
    public void encenderTV() {
        if(control!=null){
            control.encender();
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }

    @Override
    public void apagarTV() {
        if(control!=null){
            control.apagar();
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }

    @Override
    public void setCanalTV(int numCanal) {
        if(control!=null){
            control.setCanal(numCanal);
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }

    @Override
    public void subirCanalTV() {
        if(control!=null){
            control.subirCanal();
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }

    @Override
    public void bajarCanalTV() {
        if(control!=null){
            control.bajarCanal();
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }

    @Override
    public void subirVolumenTV() {
        if(control!=null){
            control.subirVolumen();
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }

    @Override
    public void bajarVolumenTV() {
        if(control!=null){
            control.bajarVolumen();
        }else{
            System.out.println("ERROR: no hay ninguna TV vinculada");
        }
    }
    
}
