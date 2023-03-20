
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class CuentaCorriente {

    private double saldoActual;
    private long numeroCuenta;
    private String pin;
    private boolean pinCorrecto = false;

    public CuentaCorriente(double saldoActual, long numeroCuenta, String pin) {
        if(numeroCuenta<=0){
            throw new IllegalArgumentException("El numero de cuenta debe ser mayor que 0");
        }
        if(saldoActual<0){
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        if(pin==null){
            throw new NullPointerException("El PIN no puede ser nulo");
        }
        if (pin.length() < 4 || pin.length() > 4 || !isNumber(pin)) {
            throw new IllegalArgumentException("El PIN a de ser de 4 digitos");
        }
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
    }

    private boolean isNumber(String pin){
        try{
            Integer.parseInt(pin);
            pinCorrecto=true;
            return pinCorrecto;
        }catch(NumberFormatException e){
            pinCorrecto=false;
            return pinCorrecto;
        }
    }
    
    public double consultaSaldo() {
        if(pinCorrecto==true){
            return saldoActual;
        }else{
            System.out.println("Ingresa Pin para consultar saldo");
            return 0;
        }
    }

    public boolean intentaAccesoConPin(String pin) {
        if (this.pin.equals(pin)) {
            pinCorrecto = true;
        } else {
            pinCorrecto = false;
        }
        return pinCorrecto;
    }

    public long getNumeroCuenta() {
        if(pinCorrecto==true){
            return numeroCuenta;
        }else{
            System.out.println("Ingresa PIN para ver numero de cuenta");
            return 0;
        }
        
    }

    public void ingresa(double importe) {
        if (pinCorrecto == true) {
            if (importe <= 0) {
                throw new IllegalArgumentException("El importe del ingreso no puede ser menor o igual a 0");
            } else {
                System.out.println("Ingreso de " + importe + "€");
                saldoActual = saldoActual + importe;
            }
        } else {
            System.out.println("Pin incorrecto");
        }

    }

    public void abona(double importe) {
        if (pinCorrecto == true) {
            if (importe <= 0) {
                throw new IllegalArgumentException("El importe del abono no puede ser menor o igual a 0");
            } else {
                System.out.println("Pago de " + importe + "€");
                saldoActual = saldoActual - importe;
            }
        } else {
            System.out.println("Pin incorrecto");
        }

    }

}
