package CoPilot;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(200, "Model S");
        myCar.drive();
    }
}

class Car {
    int horsePower;
    String model;

    Car(int horsePower, String model) {
        this.horsePower = horsePower;
        this.model = model;
    }

    void drive() {
        System.out.println("Driving a " + model + " with " + horsePower + " horsepower.");
    }
}
