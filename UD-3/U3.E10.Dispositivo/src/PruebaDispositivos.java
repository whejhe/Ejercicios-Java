

public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p = new Procesador("","");
        Memoria m = new Memoria("","");
        TarjetaVideo t = new TarjetaVideo("","");
        
        p.encender();
        System.out.println("La suma de 2+3 es "+p.suma(2, 3));
        System.out.println("La resta de 2-3 es "+p.resta(2, 3));
        System.out.println("La multiplicación de 2*3 es "+p.multiplica(2, 3));
        System.out.println("La division de 2/3 es "+p.divide(2, 3));
        p.apagar();
        System.out.println(p.toString());
        System.out.println("");
        
        
        m.encender();
        System.out.println("Ponemos un 10 en la posición 50");
        m.setElemPos(50, 10);
        System.out.println("Mostramos el elemento de la posición 50: "+m.getElemPos(50));
        System.out.println(p.toString());
        m.apagar();
        
        System.out.println("");

        t.encender();
        System.out.println("Mostramos un entero y un texto con la tarjeta de vídeo");
        t.muestraEntero(80);
        t.muestraTexto("Texto de ejemplo");
        t.apagar();
        System.out.println(t.toString());
        System.out.println("");
    }
}
