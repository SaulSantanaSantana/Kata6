package toys;

/**
 *
 * @author saul
 */
public class Car {
    
    private int serialNumber;

    public Car(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.print("Empaquetando: "+ serialNumber+"  " );
    }

    public void label(){
        System.out.print("Estiquetando: "+ serialNumber + "  ");
    }

    @Override
    public String toString() {
        return "Car{" + serialNumber + '}';
    }
    
    
    
}
