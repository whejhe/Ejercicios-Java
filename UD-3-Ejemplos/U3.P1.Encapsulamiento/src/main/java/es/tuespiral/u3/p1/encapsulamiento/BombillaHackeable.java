
package es.tuespiral.u3.p1.encapsulamiento;

public class BombillaHackeable {
    public int potencia;
    public int numVecesEncendida;
    public String marca;
    public boolean encendida, fundida;
    
    public void encender() {
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede encender");
        }
        else {
            if(encendida) {
                System.out.println("La bombilla ya estaba encendida");
            }
            else {
                numVecesEncendida++;
                encendida = true;
                if(numVecesEncendida == 10) {
                    fundida = true;
                    encendida = false;
                    System.out.println("SE FUNDIÓ en la vez "+numVecesEncendida);
                }
            }
        }
    }
    
    public void apagar() {
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede apagar");
        }
        else {
            if(encendida) {
                encendida = false;
            }
            else {
                System.out.println("La bombilla ya estaba apagada");
            }
        }
    }
    
     public void imprimeEstado() {
         if (fundida) {
             System.out.println("La bombilla está fundida");
         }
         else {
             if(encendida)
                 System.out.println("La bombilla está encendida y se ha encendido "+numVecesEncendida);
             else
                 System.out.println("La bombilla está apagada");
         }
     }
    
    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
