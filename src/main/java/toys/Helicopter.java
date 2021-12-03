
package toys;

/**
 *
 * @author saul
 */
public class Helicopter {
    
    private final int serialNumber;
    private final String type;

    public Helicopter(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
    public void pack(){
        System.out.println("Empaquetando: "+ serialNumber+"  " );
    }

    public void label(){
        System.out.print("Estiquetando: "+ serialNumber + "  ");
    }

    @Override
    public String toString() {
        return "Helicopte{" + serialNumber + '}';
    }
    
}
