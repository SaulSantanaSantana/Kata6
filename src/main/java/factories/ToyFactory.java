
package factories;

import toys.Toy;

/**
 *
 * @author saul
 */
public abstract class ToyFactory {
    
    public SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
    
        Toy toy = this.createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(String type);
    
}
