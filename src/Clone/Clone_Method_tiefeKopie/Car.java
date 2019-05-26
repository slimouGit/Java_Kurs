package Clone.Clone_Method_tiefeKopie;

/**
 * Created by salim on 07.04.2019.
 */
public class Car implements Cloneable{
    private String brand;
    private int horsePower;
    private CarEngine engine;

    public Car(String brand, int horsePower, CarEngine engine) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.engine = engine;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.horsePower + " PS, " + "Motor " + this.engine.getEngineName();
    }

    @Override
    public Car clone(){
        try {
            Car carClone = (Car) super.clone();
            carClone.engine = (CarEngine) carClone.engine.clone();
            return carClone;
        } catch (CloneNotSupportedException e) {
            System.out.println("Klonen hat nicht geklappt");
            e.printStackTrace();
        }
        return null;
    }
}
