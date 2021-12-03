package kata6;


import java.util.ArrayList;
import java.util.Scanner;
import toys.Car;
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
        
        ArrayList<Car> juguetes = new ArrayList();
        Scanner console =new Scanner(System.in);
        
        SerialNumberGenerator serialNum = new SerialNumberGenerator();
        
        System.out.println("Bienvenido al sistema de gestión de juguetería");
        System.out.println("Pulse intro para generar jugutes o teclee salir para terminar");
        
        while(!console.nextLine().equals("salir")){
            
            Car car = new Car(serialNum.next());
            car.label(); car.pack();
            
            juguetes.add(car);
            
            System.out.println(juguetes);
            
        }
        
        System.out.println("");
        System.out.println("PROGRAMA FINALIZADO");
        
    }
    
}
