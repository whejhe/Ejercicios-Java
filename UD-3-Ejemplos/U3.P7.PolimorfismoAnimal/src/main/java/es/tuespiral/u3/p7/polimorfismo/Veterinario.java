package es.tuespiral.u3.p7.polimorfismo;

public class Veterinario {
    public static void main(String[] args) {
        Tigre t1 = new Tigre();
        Tigre t2 = new Tigre();
        Gato g1 = new Gato();
        Gato g2 = new Gato();
        
        Animal[] animales = new Animal[4];
        animales[0] = t1;
        animales[1] = t2;
        animales[2] = g1;
        animales[3] = g1;
        
        for(Animal a : animales) 
            a.recibeVacuna();
    }
}

