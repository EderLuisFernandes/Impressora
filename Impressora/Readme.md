### Porque usar o interface e não o extends
[x] - Porque você quer separar responsabilidades bem claras (como imprimir, copiar, digitalizar), e deixar que qualquer classe possa adotar múltiplos comportamentos. ex ↓
public class EquipamentoMulti implements Impressora, Copiadora, Digitalizadora

[x]-  se fosse usar o  extends so ia poder implementar impessora ou copiadora ou Digitalizadora  porque o abstract  so me permite fazer uma implementação por classe
