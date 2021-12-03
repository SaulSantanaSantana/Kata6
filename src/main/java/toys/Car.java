package toys;

/**
 *
 * @author saul
 */
public class Car {
    
    private final int serialNumber;
    private final String typer;

    public Car(int serialNumber, String typer) {
        this.serialNumber = serialNumber;
        this.typer = typer;
    }

    public String getTyper() {
        return typer;
    }

    public void pack(){
        System.out.println("Empaquetando: "+ serialNumber+"  " );
    }

    public void label(){
        System.out.print("Estiquetando: "+ serialNumber + "  ");
    }

    @Override
    public String toString() {
        return "Car{" + serialNumber + '}';
    }
    
    
    
}
