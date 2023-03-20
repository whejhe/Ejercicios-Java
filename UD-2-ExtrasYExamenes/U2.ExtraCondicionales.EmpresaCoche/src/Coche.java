/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class Coche {
    
    public int potencia;
    public int aniosAntiguedad;
    public boolean electrico;
    public boolean ABS;
    public boolean airbag;

    public int getPotencia() {
        return potencia;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public boolean isABS() {
        return ABS;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }
    
    
    
}
