package Generics;

/**
 * Created by salim on 24.03.2019.
 */
public class Plate {

    private String color;
    private int diameter;

    public Plate(String color, int diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
      return "Farbe: " + this.color + " Durchmesser: " + this.diameter + " cm";
    };
}
