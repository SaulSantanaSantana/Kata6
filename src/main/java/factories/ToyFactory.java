
package factories;

import toys.Toy;

/**
 *
 * @author saul
 */
public abstract class ToyFactory {
    
    
    public Toy produceToy(Integer serialNumber){
    
        Toy toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
    
}
