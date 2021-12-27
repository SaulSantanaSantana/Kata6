package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toys.Toy;

/**
 *
 * @author saul
 */
public class ToyBuisness {
    
    private final Map<String, ToyFactory> toyFactories = new HashMap<>();
    
    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
   
    public void add(String name, ToyFactory toyFactory){
            this.toyFactories.put(name, toyFactory);
    }
    
    public Toy produceToy(String type){
        return this.toyFactories.get(type).produceToy(serialNumberGenerator.next());
    }

}
