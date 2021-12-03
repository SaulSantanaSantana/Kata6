package business;

import toys.Toy;

/**
 *
 * @author saul
 */
public abstract class ToyBuisness {
    
    public SerialNumberGenerator serialNum = new SerialNumberGenerator();
    
    public ToyBuisness(){
    }
    
    public abstract Toy createToy(String argument);
}
