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
    public boolean fundida;
    
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
        if(encendida==true && fundida==false){
            System.out.println("La bombilla ya esta encendida");
        }else if(fundida==true){
            System.out.println("La bombilla esta fundida y no se puede encender");
        }else if(numVecesEncendida==10){
            fundida=true;
            System.out.println("Acabas de fundir la bombilla");
        }else{
            encendida=true;
            numVecesEncendida++;
        }
    }
    public void apagar(){
        if(encendida==false && fundida==false){
            System.out.println("La bombilla ya esta apagada");
        }else if(fundida==true){
            System.out.println("La bombilla esta fundida y no se puede apagar");
        }else{
            encendida=false;
        }
    }
    public void imprimeEstado(){
        if(encendida==true && fundida==false){
            System.out.println("La bombilla esta encendida");
        }else if(fundida==true){
            System.out.println("La bombilla esta fundida");
        }else{
            System.out.println("La bombilla esta apagada");
        }
    }
    public double getNumVecesEncendida(){
        return numVecesEncendida;
    }
}
