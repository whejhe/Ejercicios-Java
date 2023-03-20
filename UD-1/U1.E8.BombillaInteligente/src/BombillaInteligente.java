

public class BombillaInteligente {
    
    public String marca;
    public int potencia;
    public boolean encendida;
    public int numVecesEncendida=0;
    
    public void cambiaMarca(String nuevaMarca){//setter
        marca=nuevaMarca;
    }
    public void imprimeMarca(){//getter
        System.out.println("La bombilla pertenece a la marca "+marca);
    }
    public void cambiaPotencia(int nuevaPotencia){
        potencia=nuevaPotencia;
    }
    public void imprimePotencia(){
        System.out.println("La potencia de la bombilla actual es de "+potencia);
    }
    public void encender(){
        encendida=true;
        numVecesEncendida++;
    }
    public void apagar(){
        encendida=false;
    }
    public void imprimeEstado(){
        System.out.println("Encendida?: "+encendida);
    }
    public int obtieneNumVecesEncendida(){
        System.out.println("La bombilla se ha encendio "+numVecesEncendida+" veces.");
        return numVecesEncendida;
    }
    
}
