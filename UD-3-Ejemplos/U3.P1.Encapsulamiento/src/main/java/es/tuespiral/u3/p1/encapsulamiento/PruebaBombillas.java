
package es.tuespiral.u3.p1.encapsulamiento;

public class PruebaBombillas {
    public static void main(String[] args) {
        BombillaHackeable b = new BombillaHackeable();
        // BombillaEncapsulada b = new BombillaEncapsulada();
                
        b.setPotencia(100);
        b.setMarca("Phillips");

        for (int i=1; i<=10; i++) // Se funde en el encendido nº 10
        {
            b.apagar();
            b.encender();
        }
        if (b.fundida)
           b.fundida = false;   // ¡LA DESFUNDIMOS!
        
        // La enciendo 10 veces más
        for (int i=1; i<=10; i++) 
        {
            b.apagar();
            b.encender();
        }
        b.imprimeEstado();
    }
}
