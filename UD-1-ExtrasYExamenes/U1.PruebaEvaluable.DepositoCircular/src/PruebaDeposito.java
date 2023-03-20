public class PruebaDeposito {
    public static void main(String[] args) {
        
        DepositoCircular d = new DepositoCircular();
        
        d.setAltura(10);
        d.setRadio(5);
        d.setLitrosRiegoHora(1);
        
        d.cargaDeposito(100);
        
        System.out.println("Altura deposito: "+d.getAltura());
        System.out.println("Radio deposito: "+d.getRadio());
        System.out.println("Gasto a la hora: "+d.getLitrosRiegoHora());
        System.out.println("Litros actuales: "+d.getNumLitrosActual());
        System.out.println("Superficie: "+d.calculaSuperficieBase());
        System.out.println("Perimetro: "+d.calculaPerimetroBase());
        System.out.println("Capacidad: "+d.calculaCapacidad());
        
        System.out.println("");
        
        d.riega(5);
        System.out.println("Litros actuales: "+d.getNumLitrosActual());
        
    }
}
