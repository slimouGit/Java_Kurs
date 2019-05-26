package Vererbung;

/**
 * Created by salim on 05.03.2019.
 */
public class Cat extends Animal {

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void purr(){
        System.out.println("Cat is purring");
    }
}
