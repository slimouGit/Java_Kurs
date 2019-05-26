package Vererbung;

/**
 * Created by salim on 05.03.2019.
 */
public class Tiger extends Animal {
    public Tiger(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves with 80 km/h");
    }

    public void move(int kmh) {
        System.out.println(getName() + " moves with " + kmh + " km/h");
    }
}
