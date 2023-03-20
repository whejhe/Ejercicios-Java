/**
 *
 * @author usuario
 */
public class PruebaDispositivo {
    public static void main(String[] args) {
        
        Raton r = new Raton();
        Teclado t = new Teclado();
        Pantalla p = new Pantalla();
        Impresora i = new Impresora();
        Entrada e = t;
        Dispositivo d = p;
        
        
        Entrada ent = r;
        Dispositivo dis = e;
        //Salida sal = t; //No estan relacionadas
        //Impresora imp = (Impresora) t; //Estan al mismo nivel y no estan relacionadas
        EntradaSalida es = i;
        Salida s = (Salida) d;
        Pantalla pant = (Pantalla)d; //Hay que tratarlo como Pantalla
        Teclado tec = (Teclado)e; //Hay que tratarlo como teclado 
        //Raton rat = (Raton) t; //Estan al mismo nivel
        
    }
}
