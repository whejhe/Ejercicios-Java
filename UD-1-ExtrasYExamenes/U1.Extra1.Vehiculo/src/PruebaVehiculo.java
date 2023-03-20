public class PruebaVehiculo {
    public static void main(String[] args) {
        
        Vehiculo v = new Vehiculo();
        
        v.setNumRuedas(4);
        System.out.println("El coche tiene "+v.getNumRuedas()+" ruedas");
        v.setPotencia(200);
        System.out.println("Una potencia de "+v.getPotencia());
        v.setConsumoPor100Km(10);
        System.out.println("Y consume "+v.getConsumoPor100Km()+" litros a los 100");
        
        System.out.println("");
       
        v.reponerCombustible(30);
        System.out.println("Despues de reponer combustible tenemos "+v.getLitrosEnDeposito()
                +" litros en deposito, con un desgaste actual del "+v.calculaPorcentajeDesgaste()+"%");
        v.arrancar();
        
        v.recorrerDistancia(10);
        v.apagar();
        v.reponerCombustible(5);
        System.out.println("Despues de reponer combustible tenemos "+v.getLitrosEnDeposito()
                +" litros en deposito, con un desgaste actual del "+v.calculaPorcentajeDesgaste()+"%");
       
        
    }
}
