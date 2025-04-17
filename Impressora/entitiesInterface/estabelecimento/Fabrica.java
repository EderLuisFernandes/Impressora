package estabelecimento;

import entitiesInterface.impressora.Impressora;
import equipamento.multifuncional.EquipamentoMulti;

public class Fabrica {

    public static void main(String[] args) {
        // Polimorfismo: EquipamentoMulti sendo usado como Impressora e instanciando 
        Impressora impressora = new EquipamentoMulti();
        
        // Chamando o método de impressão
        impressora.imprimir();
    }
}
