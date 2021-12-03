/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches;

/**
 *
 * @author saul
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches;

import business.ToyBuisness;
import toys.Models.AsianCarToy;
import toys.Models.AsianHelicopterToy;
import toys.Toy;

/**
 *
 * @author saul
 */
public class AsianToyBusiness extends ToyBuisness {

    @Override
    public Toy createToy(String argument) {
        switch(argument){
            case "car" -> {
                AsianCarToy car = new AsianCarToy(serialNum.next(),"");
                car.pack(); 
                car.label();
                return car;
            }
  
                
            case "helicopter" -> {
                AsianHelicopterToy helicopter = new AsianHelicopterToy(serialNum.next(),"");
                helicopter.pack();
                helicopter.label();
                return helicopter;
            }
                
            default -> System.out.println("Comando desconocido");
        }
        
        return null;
    }
    
}
