
public class DuchaInteligente {

    public int numVecesUtilizada;
    public double litrosGastados;
    public double totalLitrosGastados;
    public double litrosPorSegundo;
    public double temperatura;
    public boolean activa;

    public void setLitrosPorSegundo(double nuevoLitrosPorSegundo) {
        litrosPorSegundo = nuevoLitrosPorSegundo;
    }

    public void setTemperatura(double nuevaTemperatura) {
        temperatura = nuevaTemperatura;
    }

    public int getNumVecesUtilizada() {
        return numVecesUtilizada;
    }

    public double getTotalLitrosGastados() {
        return totalLitrosGastados;
    }

    public void subeTemperatura() {
        temperatura = temperatura + 0.5;
    }

    public void bajaTemperatura() {
        temperatura = temperatura - 0.5;
    }

    public void imprimeEstadoDucha() {
        System.out.println("ESTADO: Activa: " + activa + ". Temperatura: " 
                + temperatura + "º. Caudal: " + litrosPorSegundo+" litros/seg");
    }

    public double activaUnTiempo(double segundos) {
        activa = true;
        litrosGastados = litrosPorSegundo * segundos;
        totalLitrosGastados = totalLitrosGastados + litrosGastados;
        return litrosGastados;
    }

    public void desactivar() {
        activa = false;
        numVecesUtilizada++;
        System.out.println("Acabas de gastar " + totalLitrosGastados + " litros");
        System.out.println("Estadisticas: has usado la ducha " + numVecesUtilizada 
                + " veces y has gastado un total de " + totalLitrosGastados);
    }

}
