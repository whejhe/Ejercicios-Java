/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class BombillaCondicional {
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida;
    
    public void setMarca(String nuevaMarca){
        marca=nuevaMarca;
    }
    public void imprimeMarca(){
        System.out.println("Marca: "+marca); 
   }
    public void setPotencia(int nuevaPotencia){
        potencia=nuevaPotencia;
    }
    public void imprimePotencia(){
        System.out.println("Potencia: "+potencia);
    }
    public void encender(){
        if(encendida==true){
            System.out.println("La bombilla ya esta encendida");
        }else{
            encendida=true;
            numVecesEncendida++;
        }
    }
    public void apagar(){
        if(encendida==false){
            System.out.println("La bombilla ya esta apagada");
        }else{
            encendida=false;
        }
    }
    public void imprimeEstado(){
        if(encendida==true){
            System.out.println("La bombilla esta encendida");
        }else{
            System.out.println("La bombilla esta apagada");
        }
    }
    public double getNumVecesEncendida(){
        return numVecesEncendida;
    }
}
