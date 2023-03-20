public class PruebaCircunferencia {
    public static void main(String[] args) {
        
        Circunferencia c = new Circunferencia();
        
        
        c.estableceRadio(5);
        System.out.println("El Perimetro del circulo es de: "+c.calculaPerimetro());
        System.out.println("La superficie del circulo es de: "+c.calculaSuperficie());
        
        
    }
}
