public class Expresiones {
    
    public int edad=40;
    public double precio=1.18;
    public long entero=922337203;
    public short corto=32767;
    public float rango=1.1f;
    public byte miByte=1;
    
    public int a = corto*miByte+edad*2/3;
    public float b = corto*rango+edad*entero;
    public float c = edad*50L+corto+miByte;
    public double d =(int)(precio*rango+entero*edad);
    public double e = edad*23.33+entero*rango;
    public double f = corto+miByte+rango+edad+precio;
    public double g = (float)(edad+entero);
    public double h = (float)edad+precio;
    public float i = miByte*23.33F+edad;
    
    public void imprimeExpresiones(){
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
   }
    
}
