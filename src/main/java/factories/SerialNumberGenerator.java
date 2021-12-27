package factories;

/**
 *
 * @author saul
 */
public class SerialNumberGenerator {
    
    private static int serialNumber = -1;
    
    public int next(){
        serialNumber += 1;
        return serialNumber;
    }
}
