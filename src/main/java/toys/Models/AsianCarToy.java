package toys.Models;

import toys.Toy;

/**
 *
 * @author saul
 */
public class AsianCarToy implements Toy{
    private final int serialNumber;
    private final String typer;

    public AsianCarToy(int serialNumber, String typer) {
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
        return "AsianCarToy{" + serialNumber + '}';
    }
}
