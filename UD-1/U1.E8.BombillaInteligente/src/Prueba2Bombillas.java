public class Prueba2Bombillas {
    public static void main(String[] args) {
        
        BombillaInteligente b1 = new BombillaInteligente();
        BombillaInteligente b2 = new BombillaInteligente();
        
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        b1.encender();
        b1.apagar();
        
        b2.encender();
        b2.apagar();
        
        b1.obtieneNumVecesEncendida();
        b2.obtieneNumVecesEncendida();
    }
}
