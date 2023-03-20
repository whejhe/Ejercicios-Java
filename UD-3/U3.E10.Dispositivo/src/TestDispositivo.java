/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class TestDispositivo{
    public static void main(String[] args) {
        
        Dispositivo p1 = new Procesador("AMD","Ryzen 7 580");
        Dispositivo p2 = new Procesador("Intel","Corei9");
        Dispositivo m1 = new Memoria("Kingston Fury","DDR3");
        Dispositivo m2 = new Memoria("Kingston ValueRAM","DDR3");
        Dispositivo t1 = new TarjetaVideo("AMD","Radeon 720");
        
        final int BUCLE = 100;
        Dispositivo[] disp = {p1,p2,m1,m2,t1};
        
        for(int i=0;i<disp.length;i++){
            for(int j=0;j<BUCLE;j++){
                disp[i].encender();
                System.out.println(disp[i].toString()+" ¿esta encendido? "+disp[i].isEncendido());
                disp[i].apagar();
                System.out.println(disp[i].toString()+" ¿esta encendido? "+disp[i].isEncendido());
            }
        }
        
    }
}
