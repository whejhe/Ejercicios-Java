package es.tuespiral.u4.p8.cajagenerica;

public class PruebaCajaGenerica {
    public static void main(String[] args) {
        CajaGenerica<Ropa> cajaRopa = new CajaGenerica<>();
        CajaGenerica<Comida> cajaComida = new CajaGenerica<>();
        
        Ropa pantalon = new Ropa();
        Comida pan = new Comida();      
        
        cajaRopa.guarda(pantalon);
        pantalon = cajaRopa.saca();
        cajaComida.guarda(pan);
        
        //cajaRopa.guarda(pan);
    }
}
