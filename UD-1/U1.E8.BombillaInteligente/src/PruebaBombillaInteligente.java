

public class PruebaBombillaInteligente {
    public static void main(String[] args) {
        
        BombillaInteligente b =new BombillaInteligente();
        
        b.imprimeMarca();
        b.imprimePotencia();
        
        b.cambiaMarca("Phillips");
        
        b.cambiaPotencia(100);
        
        b.encender();
        b.apagar();
        b.encender();
        
        b.imprimeMarca();
        b.imprimePotencia();
        b.imprimeEstado();
        b.obtieneNumVecesEncendida();
    }
}
