package Generics;

/**
 * Created by salim on 24.03.2019.
 */
public class Main {
    public static void main(String[] args){

        Plate plate = new Plate("white", 28);
        Spoon spoon = new Spoon("Teelöffel", 10);

        Box<Plate> box1 = new Box<>(plate);
        Box<Spoon> box2 = new Box<>(spoon);

        System.out.println(box1.getObjectInBox());
        System.out.println(box2.getObjectInBox());



    }
}
