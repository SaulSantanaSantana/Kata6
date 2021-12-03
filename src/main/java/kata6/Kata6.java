package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
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
        
        ArrayList<Car> juguetesC = new ArrayList();
        ArrayList<Helicopter> juguetesH = new ArrayList();
        Scanner console =new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de gestión de juguetería");
        //System.out.println("Pulse intro para generar jugutes o teclee salir para terminar");
        System.out.println("Comandos: car, helicopter, salir.");
        System.out.println("");
        
        String code = console.nextLine();
        
        while(!code.equals("salir")){
            
            if(code.equals("car")){
                
                Car car= generator.createCar();
                juguetesC.add(car);
                
            }else if(code.equals("helicopter")){
                
            Helicopter helicopter = generator.helicopter();
                juguetesH.add(helicopter);
            }
            
            System.out.print("Cars: ");System.out.print(juguetesC);
            System.out.print(" Heicopters: ");System.out.println(juguetesH);
            
            code = console.nextLine();
            
        }
        
        System.out.println("");
        System.out.println("PROGRAMA FINALIZADO");
        
    }
    
}
