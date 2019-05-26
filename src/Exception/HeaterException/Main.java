package Exception.HeaterException;

/**
 * Created by salim on 13.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        Heater heater = new Heater(0);
        try {
            heater.regulateHeater();
        }catch (HeaterException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
