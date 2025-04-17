package entitiesInterface.copiadora;

// aqui eu usso o implements porque  na abtração eu comecei com o interface
public class Xerox implements Copiadora {
    
    @Override
    public void copiar() {
        System.out.println("Copiando ");
    }
}