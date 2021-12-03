
package toys.Models;

import toys.Toy;

/**
 *
 * @author saul
 */
public class AsianHelicopterToy implements Toy {
    
    private final int serialNumber;
    private final String typer;

    public AsianHelicopterToy(int serialNumber, String typer) {
        this.serialNumber = serialNumber;
        this.typer = typer;
    }

    public String getTyper() {
        return typer;
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
        return "AsianHelicopterToy{" + serialNumber + '}';
    }
}
