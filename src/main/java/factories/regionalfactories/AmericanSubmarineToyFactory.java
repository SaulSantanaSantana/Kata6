/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories.regionalfactories;

import factories.ToyFactory;
import toys.Models.AmericanSubmarineToy;
import toys.Toy;

/**
 *
 * @author saul
 */
public class AmericanSubmarineToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer argument) {
        AmericanSubmarineToy toy = new AmericanSubmarineToy(argument,"");
        return toy;
    }
}
    