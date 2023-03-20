public class PruebaAbeja2 {
    public static void main(String[] args) {
        
        Abeja a = new Abeja();
        
        System.out.println("Punto 2");
        a.vuela();
        a.imprimeEstadoVuelo();
        a.cambiaPosicionX(2);
        a.imprimePosicionX();
        a.imprimePosicionY();
        a.sePosa();
        a.imprimeEstadoVuelo();
        a.cambiaCargaNectar(1);
        a.imprimeNumCargasNectar();
        System.out.println("");
        
        System.out.println("Punto 3");
        a.vuela();
        a.imprimeEstadoVuelo();
        a.cambiaPosicionY(2);
        a.imprimePosicionX();
        a.imprimePosicionY();
        a.sePosa();
        a.imprimeEstadoVuelo();
        a.cambiaCargaNectar(2);
        a.imprimeNumCargasNectar();
        System.out.println("");
        
        System.out.println("Punto 4");
        a.vuela();
        a.imprimeEstadoVuelo();
        a.cambiaPosicionX(0);
        a.imprimePosicionX();
        a.imprimePosicionY();
        a.sePosa();
        a.imprimeEstadoVuelo();
        a.cambiaCargaNectar(3);
        a.imprimeNumCargasNectar();
        System.out.println("");
        
        
        
    }
}
