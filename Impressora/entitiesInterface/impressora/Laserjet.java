package entitiesInterface.impressora;

public class Laserjet implements Impressora {
    
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Laserjet");
    }
}
