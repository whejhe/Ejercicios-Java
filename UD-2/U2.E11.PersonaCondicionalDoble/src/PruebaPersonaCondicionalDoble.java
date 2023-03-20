/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class PruebaPersonaCondicionalDoble {
    public static void main(String[] args) {
        
        PersonaCondicionalDoble p =new PersonaCondicionalDoble();
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        p.setTieneTrabajo(true);
        
        if(p.getEdad()<18){
            System.out.println("Eres menor de Edad");
        }else{
            System.out.println("Eres mayor de Edad");
        }
        /*----------------------------------------------*/
        if(p.getAltura()>=185){
            System.out.println("Eres alto/a");
        }else{
            System.out.println("No eres alto");
        }
        /*----------------------------------------------*/
        if(p.isEstaCasado()==true){
            if(p.isTieneTrabajo()==true){
                System.out.println("Casado y con Trabajo");
            }else{
                System.out.println("Casado y sin Trabajo");
            }
        }else{
            System.out.println("No esta casado");
        }
        /*----------------------------------------------*/
    }
    
}
