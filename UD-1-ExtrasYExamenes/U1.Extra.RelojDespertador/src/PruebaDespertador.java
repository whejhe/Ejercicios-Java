public class PruebaDespertador {
    public static void main(String[] args) {
        
        RelojDespertador d = new RelojDespertador();
        
        d.setHora(20, 28);
        d.setHoraAlarma(22, 30);
        d.activarAlarma();
        
        d.imprimirEstadoAlarma();
        d.imprimirHoraActual();
        d.imprimirHoraAlarma();
        
        //d.setHora(22, 30);
        d.sonarAlarma();
        d.imprimirHoraActual();
        
    }
}
