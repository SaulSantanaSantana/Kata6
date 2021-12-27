package toys.Models;

import toys.Toy;

/**
 *
 * @author saul
 */
public class AsianSubmarineToy implements Toy{
    private final int serialNumber;
    private final String type;

    public AsianSubmarineToy(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public String getTyper() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.print("Empaquetando: "+ serialNumber+"  " );
    }

    @Override
    public void label(){
        System.out.print("Estiquetando: "+ serialNumber + "  ");
    }

    @Override
    public String toString() {
        return "AsianSubmarineToy{" + serialNumber + '}';
    }
}
