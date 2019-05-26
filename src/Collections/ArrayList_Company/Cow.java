package Collections.ArrayList_Company;

/**
 * Created by salim on 30.03.2019.
 */
public class Cow {
    private String name;
    private double weight;
    private int age;

    public Cow(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kuh " + this.name + " weights " + this.weight + " in the age of " + this.age + " years";
    }
}
