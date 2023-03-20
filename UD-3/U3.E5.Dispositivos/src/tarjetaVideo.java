/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class tarjetaVideo extends Dispositivo {

    private int operacionNum;
    private int operacionText;
    private int muestraNum;
    private String muestraText;

    public int getMuestraNum() {
        if(isEncendido()){
            operacionNum++;
            System.out.println(muestraNum);
            return muestraNum;
        }else{
            error();
            return -1;
        }
    }

    public void setMuestraNum(int num) {
        muestraNum = num;
    }

    public String getMuestraText() {
        if(isEncendido()){
            operacionText++;
            System.out.println(muestraText);
            return muestraText;
        }else{
            error();
            return "-1";
        }
    }

    public void setMuestraText(String text) {
        muestraText = text;
    }
    
    
    
}
