/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toys.Models.AsianCarToy;
import toys.Models.AsianHelicopterToy;
import toys.Toy;

/**
 *
 * @author saul
 */
public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String argument) {
        switch(argument){
            case "car" -> {
                AsianCarToy car = new AsianCarToy(serialNumberGenerator.next(),"");
                return car;
            }
  
                
            case "helicopter" -> {
                AsianHelicopterToy helicopter = new AsianHelicopterToy(serialNumberGenerator.next(),"");
                return helicopter;
            }
                
            default -> System.out.println("Comando desconocido");
        }
        
        return null;
    }
    
}