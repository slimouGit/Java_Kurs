package Vererbung;

/**
 * Created by salim on 05.03.2019.
 */
public class Dog extends Animal {

    private boolean tail;

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public Dog(String name, int age, String color, boolean tail) {
        super(name, age, color);
        this.tail = tail;
    }


    public void bark(){
        System.out.println(this.getName() + " is barking");
    }

    public void sayColor(){
        System.out.println("My color is " + this.getColor());
    }
}
