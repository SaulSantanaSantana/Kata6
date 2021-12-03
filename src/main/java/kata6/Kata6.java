package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
/**
 *
 * @author saul
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Car> juguetesC = new ArrayList();
        ArrayList<Helicopter> juguetesH = new ArrayList();
        Scanner console =new Scanner(System.in);
        
        SerialNumberGenerator serialNum = new SerialNumberGenerator();
        
        System.out.println("Bienvenido al sistema de gestión de juguetería");
        //System.out.println("Pulse intro para generar jugutes o teclee salir para terminar");
        System.out.println("Comandos: car, helicopter, salir.");
        System.out.println("");
        
        String code = console.nextLine();
        
        while(!code.equals("salir")){
            
            if(code.equals("car")){
                
                Car car = new Car(serialNum.next(), "red");
                car.label(); car.pack();
            
                juguetesC.add(car);
                
            }else if(code.equals("helicopter")){
                
                Helicopter helicopter = new Helicopter(serialNum.next(), "blue");
                helicopter.label(); helicopter.pack();
            
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
