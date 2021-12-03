package toys;

/**
 *
 * @author saul
 */
public class ToyBuisness {
    
    SerialNumberGenerator serialNum = new SerialNumberGenerator();
    
    public ToyBuisness(){
    }
    
    public Car createCar(){
        Car car = new Car(serialNum.next(), "red");
        car.label(); car.pack();
        return car;
    }
    
    public Helicopter helicopter(){
        Helicopter helicopter = new Helicopter(serialNum.next(), "blue");
        helicopter.label(); helicopter.pack();
        return helicopter;
    }
}
