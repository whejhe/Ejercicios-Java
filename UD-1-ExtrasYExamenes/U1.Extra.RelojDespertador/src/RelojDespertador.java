public class RelojDespertador {
    
    public int horaActual;
    public int minutoActual;
    public int horaAlarma;
    public int minutoAlarma;
    public boolean alarma;
    
    public void setHora(int hora,int minutos){
        horaActual=hora;
        minutoActual=minutos;
    }
    public void setHoraAlarma(int horaAlarm,int minAlarm){
        horaAlarma=horaAlarm;
        minutoAlarma=minAlarm;
    }
    public int getHoraActual(){
        return horaActual;
    }
    public int getMinutoActual(){
        return minutoActual;
    }
    public int getHoraAlarma(){
        return horaAlarma;
    }
    public int getMinutoAlarma(){
        return minutoAlarma;
    }
    public void activarAlarma(){
        alarma=true;
    }
    public void desactivarAlarma(){
        alarma=false;
    }
    public void sonarAlarma(){
        if(alarma=true && horaActual==horaAlarma &&minutoActual==minutoAlarma){
            System.out.println("PI PI PI PI… PI PI PI PI");
        }else{
            System.out.println("Sigue durmiendo");
        }
    }
    public void imprimirHoraActual(){
        System.out.println("Son las "+horaActual+":"+minutoActual);
    }
    public void imprimirHoraAlarma(){
        System.out.println("La alarma sonara a las "+horaAlarma+":"+minutoAlarma);
    }
    public void imprimirEstadoAlarma(){
        System.out.println("¿Esta la alarma activada? "+alarma);
    }
            
}
