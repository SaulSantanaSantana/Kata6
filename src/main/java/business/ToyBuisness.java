package business;

import factories.ToyFactory;
import toys.Toy;

/**
 *
 * @author saul
 */
public class ToyBuisness {
    
    private final ToyFactory toyfactory;
    
    public ToyBuisness(ToyFactory toyfactory) {
        this.toyfactory = toyfactory;
    }
    
    public Toy produceToy(String type){
        return this.toyfactory.produceToy(type);
    }

}
