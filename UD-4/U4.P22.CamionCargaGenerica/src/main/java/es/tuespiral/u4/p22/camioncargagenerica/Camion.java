package es.tuespiral.u4.p22.camioncargagenerica;

public class Camion <T> {
    private T carga;
    
    public void carga(T carga) {
        this.carga = carga;
    }
    
    public T descarga() {
        T aux = carga;
        carga = null;
        return aux;
    }
    
    public boolean isCargado() {
        return carga != null;
    }
    
    public double getKilosCarga() {
        if (carga != null) {
            Pesable peso = (Pesable) carga;
            return peso.getPeso();
        } else {
            return 0;
        }
    }
    
}
