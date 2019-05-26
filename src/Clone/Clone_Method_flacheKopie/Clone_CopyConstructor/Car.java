package Clone.Clone_Method_flacheKopie.Clone_CopyConstructor;

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

    //CopyConstructor
    public Car(Car otherCar){
        //primitive Attribute
        this.brand = otherCar.getBrand();
        this.horsePower = otherCar.getHorsePower();
        //komplexe Attribute
        CarEngine carEngine = new CarEngine(otherCar.getEngine().getEngineName());
        this.engine = carEngine;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
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
