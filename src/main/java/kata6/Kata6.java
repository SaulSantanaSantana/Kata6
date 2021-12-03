package kata6;


import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;

import java.util.ArrayList;
import java.util.Scanner;
import toys.Toy;
/**
 *
 * @author saul
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Toy> juguetes = new ArrayList();
        Scanner console =new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de gestión de juguetería");
        //System.out.println("Pulse intro para generar jugutes o teclee salir para terminar");
        
        System.out.println("Comandos: car, helicopter, salir.");
        System.out.println("");
        
        String code;
        
        while(!"salir".equals(code=console.nextLine())){
            System.out.print("Seleccione marca: asian o american");
            
            
            Scanner scn =new Scanner(System.in);
            System.out.println();
            String branch = scn.nextLine();
            
            switch(branch){
                case "american":
                    AmericanToyBusiness generator = new AmericanToyBusiness();
                    Toy newToy = generator.createToy(code);
                    System.out.println();
            
                    if(newToy != null){
                        juguetes.add(newToy);

                    }
                    break;
                    
                case "asian":
                    AsianToyBusiness generator0 = new AsianToyBusiness();
                    Toy newToy0 = generator0.createToy(code);
                                       System.out.println();
            
                    if(newToy0 != null){
                        juguetes.add(newToy0);
                    }
                    
                    break;
            }
            
            
            System.out.print("Juguetes: ");System.out.print(juguetes);
            System.out.println();
            System.out.println();
            
        }
        
        System.out.println("");
        System.out.println("PROGRAMA FINALIZADO");
        
    }
    
}
