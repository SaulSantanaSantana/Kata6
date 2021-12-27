/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toys.Models.AmericanCarToy;
import toys.Models.AmericanHelicopterToy;
import toys.Toy;

/**
 *
 * @author saul
 */
public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String argument) {
        switch(argument){
            case "car" -> {
                AmericanCarToy car = new AmericanCarToy(serialNumberGenerator.next(),"");
                return car;
            }
  
                
            case "helicopter" -> {
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(serialNumberGenerator.next(),"");
                return helicopter;
            }
                
            default -> System.out.println("Comando desconocido");
        }
        
        return null;
    }
}
    