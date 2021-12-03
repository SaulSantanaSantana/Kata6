package toys;

import toys.Models.Helicopter;
import toys.Models.Car;

/**
 *
 * @author saul
 */
public class ToyBuisness {
    
    SerialNumberGenerator serialNum = new SerialNumberGenerator();
    
    public ToyBuisness(){
    }
    
    public Toy createToy(String argument){
        
        switch(argument){
            case "car" -> {
                Car car = new Car(serialNum.next(),"");
                car.pack(); 
                car.label();
                return car;
            }
  
                
            case "helicopter" -> {
                Helicopter helicopter = new Helicopter(serialNum.next(),"");
                helicopter.pack();
                helicopter.label();
                return helicopter;
            }
                
            default -> System.out.println("Comando desconocido");
        }
        
        return null;
    }
}
