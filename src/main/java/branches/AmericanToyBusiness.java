/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches;

import business.ToyBuisness;
import toys.Models.AmericanCarToy;
import toys.Models.AmericanHelicopterToy;
import toys.Toy;

/**
 *
 * @author saul
 */
public class AmericanToyBusiness extends ToyBuisness {

    @Override
    public Toy createToy(String argument) {
        switch(argument){
            case "car" -> {
                AmericanCarToy car = new AmericanCarToy(serialNum.next(),"");
                car.pack(); 
                car.label();
                return car;
            }
  
                
            case "helicopter" -> {
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(serialNum.next(),"");
                helicopter.pack();
                helicopter.label();
                return helicopter;
            }
                
            default -> System.out.println("Comando desconocido");
        }
        
        return null;
    }
    
}
