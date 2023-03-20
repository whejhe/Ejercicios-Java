
public class PruebaDuchaInteligente {

    public static void main(String[] args) {
        DuchaInteligente ducha = new DuchaInteligente();

        ducha.setTemperatura(35);
        ducha.setLitrosPorSegundo(1);
        ducha.activaUnTiempo(20);
        ducha.subeTemperatura();
        ducha.subeTemperatura();
        ducha.setLitrosPorSegundo(1.5);
        ducha.activaUnTiempo(280);
        ducha.desactivar();
        ducha.imprimeEstadoDucha();

        ducha.setLitrosPorSegundo(2);
        ducha.activaUnTiempo(100);
        ducha.bajaTemperatura();
        ducha.activaUnTiempo(80);
        ducha.desactivar();

        ducha.getNumVecesUtilizada();
        ducha.getTotalLitrosGastados();

        System.out.println("En cada ducha gastas un promedio de " 
                + ducha.getTotalLitrosGastados() / ducha.getNumVecesUtilizada());

    }
}
