package prueba.evaluable.impresora;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Impresora {
    
    private String Marca,Modelo;
    private int anioFabricacion;
    private boolean encendida;
    private double numMililitros,capMaxima;

    public Impresora(String Marca, String Modelo, int anioFabricacion, double capMaxima) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.anioFabricacion = anioFabricacion;
        if(anioFabricacion<=0){
            this.anioFabricacion=2000;
        }
        this.capMaxima = capMaxima;
        if(capMaxima<=0){
            this.capMaxima=7;
        }
    }

    public Impresora(String Marca, String Modelo, int anioFabricacion) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.anioFabricacion = anioFabricacion;
        if(anioFabricacion<=0){
            this.anioFabricacion=2000;
        }
        if(Marca.equalsIgnoreCase("Epson") || Marca.equalsIgnoreCase("Brother")){
            this.capMaxima=10;
        }else if(Marca.equalsIgnoreCase("HP") && Modelo.equalsIgnoreCase("R30")){
            this.capMaxima=30;
        }else if(Marca.equalsIgnoreCase("Kodak")){
            this.capMaxima=5;
        }else{
         this.capMaxima=7;   
        }
        
        numMililitros=this.capMaxima;
    }
    
    public void encender(){
        if(encendida==true){
            System.out.println("Error, ya se encuentra encendida");
        }else{
            encendida=true;
        }
    }
    
    public void apagar(){
        if(encendida==false){
            System.out.println("Error, ya esta apagada");
        }else{
            encendida=false;
        }
    }
    
    public void recarga(){
        if(encendida==true){
            System.out.println("Error, tienes que apagar la impresora para recargar");
        }else{
            numMililitros=capMaxima;
        }
    }
    
    public void recarga(double num){
        if(encendida==true){
            System.out.println("Error, tienes que apagar la impresora para recargar");
        }else{
            numMililitros=num;
            if(numMililitros>capMaxima){
                System.out.println("Error, capacidad Maxima superada");
                numMililitros=capMaxima;
            }
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Marca: "+Marca);
        System.out.println("Modelo: "+Modelo);
        System.out.println("Año de Fabricacion: "+anioFabricacion);
        if(encendida==true){
            System.out.println("Estado: Encendida");
        }else{
            System.out.println("Estado: Apagada");
        }
        System.out.println("Nº mililitros Disponibles: "+numMililitros);
        System.out.println("Capacidad Maxima: "+capMaxima+"ml");
    }
    
    public void imprimir(){
        if(encendida==false){
            System.out.println("Error, impresora apagada");
        }else if(numMililitros>=0.5){
            numMililitros-=0.5;
        }else{
            System.out.println("Error, no queda suficiente tinta");
        }
    }
    
    public void imprimir(int numPag){
        if(encendida==false){
            System.out.println("Error, impresora apagada");
        }else{
            for(int i=0;i<numPag;i++){
                if(numMililitros<0.5){
                    System.out.println("No queda suficiente tinta");
                    break;
                }
                numMililitros-=0.5;
                System.out.println("Se ha impreso "+(i+1)+" pagina");
            }
        }
    }
}
