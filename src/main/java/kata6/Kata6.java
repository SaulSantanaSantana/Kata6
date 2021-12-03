package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import toys.Models.Car;
import toys.Models.Helicopter;
import toys.Toy;
import toys.ToyBuisness;
/**
 *
 * @author saul
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ToyBuisness generator = new ToyBuisness();
        
        ArrayList<Toy> juguetes = new ArrayList();
        Scanner console =new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de gestión de juguetería");
        //System.out.println("Pulse intro para generar jugutes o teclee salir para terminar");
        System.out.println("Comandos: car, helicopter, salir.");
        System.out.println("");
        
        String code;
        
        while(!"salir".equals(code=console.nextLine())){
            
            Toy newToy = generator.createToy(code);
            System.out.println();
            
            if(newToy != null){
                juguetes.add(newToy);
                System.out.print("Juguetes: ");System.out.print(juguetes);
                System.out.println();
                System.out.println();
            }
            

        }
        
        System.out.println("");
        System.out.println("PROGRAMA FINALIZADO");
        
    }
    
}
