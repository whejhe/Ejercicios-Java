
import figuras.Circulo;
import figuras.Triangulo;
import lineas.Curva;
import lineas.Recta;

public class PruebaImportaciones {

    public static void main(String[] args) {

        Circulo Circulo1 = new Circulo();
        Triangulo Triangulo1 = new Triangulo();
        Curva Curva1 = new Curva();
        Recta Recta1 = new Recta();

        Circulo1.quienSoy();
        Triangulo1.quienSoy();
        Curva1.quienSoy();
        Recta1.quienSoy();
    }
}
