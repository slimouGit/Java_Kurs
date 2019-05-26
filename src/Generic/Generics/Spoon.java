package Generics;

/**
 * Created by salim on 24.03.2019.
 */
public class Spoon {
    private String name;
    private int length;

    public Spoon(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
