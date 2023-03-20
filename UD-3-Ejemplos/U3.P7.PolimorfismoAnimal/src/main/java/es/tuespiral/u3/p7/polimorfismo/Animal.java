package es.tuespiral.u3.p7.polimorfismo;

public abstract class Animal {
    protected String nombre;
    protected int anioNacimiento;
    protected boolean vacunado;
    
    public abstract void haceRuido();
    
    public void recibeVacuna() {
        vacunado = true;
    }
}
