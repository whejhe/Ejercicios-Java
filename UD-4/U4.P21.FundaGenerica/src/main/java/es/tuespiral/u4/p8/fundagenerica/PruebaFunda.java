package es.tuespiral.u4.p8.fundagenerica;

public class PruebaFunda {
    public static void main(String[] args) {
        Funda<Smartphone> fundaMovil = new Funda<>();
        Funda<Tablet> fundaTablet = new Funda<>();
        
        Smartphone s = new Smartphone("Samsung", "Galaxy 8", 6);
        Tablet t = new Tablet("Huawei", "P10", 10);
        
        fundaMovil.guarda(s);
        System.out.println("Esta la funda del móvil vacía: "+fundaMovil.isVacia());
        fundaMovil.saca();
        System.out.println("Esta la funda del móvil vacía: "+fundaMovil.isVacia());
        
        fundaTablet.guarda(t);
        System.out.println("Esta la funda de la tablet vacía: "+fundaTablet.isVacia());
        fundaTablet.saca();
        System.out.println("Esta la funda de la tablet vacía: "+fundaTablet.isVacia());
    }
}
