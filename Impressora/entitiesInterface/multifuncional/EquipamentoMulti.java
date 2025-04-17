package equipamento.multifuncional;

import entitiesInterface.copiadora.Copiadora;
import entitiesInterface.digitadora.Digitalizadora;
import entitiesInterface.impressora.Impressora;

public class EquipamentoMulti implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    @Override
    public void Digitar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
}
