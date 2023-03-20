/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaTraductor {
    public static void main(String[] args) {
        
        Traduccion[] t = new Traduccion[5];
        
        t[0]=new Traduccion();
        t[0].setEnglish("To break down");
        t[0].setSpanish("Averiar");
        
        t[1]=new Traduccion();
        t[1].setEnglish("To fix");
        t[1].setSpanish("Arreglar");
        
        t[2]=new Traduccion();
        t[2].setEnglish("To reboot");
        t[2].setSpanish("Reiniciar");
        
        t[3]=new Traduccion();
        t[3].setEnglish("To work");
        t[3].setSpanish("Funcionar");
        
        t[4]=new Traduccion();
        t[4].setEnglish("To type");
        t[4].setSpanish("Teclear");
        
        /*for(int i=0;i<t.length;i++){
            System.out.println(t[i].getEnglish()+" en español se traduce por "+t[i].getSpanish());
        }*/
        
        for(Traduccion j:t){
            System.out.println(j.getEnglish()+" en español se traduce por "+j.getSpanish());
        }
        
    }
}
