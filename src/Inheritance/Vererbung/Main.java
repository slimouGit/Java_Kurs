package Vererbung;


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Gaston",3,"white");
        dog.sleep();
        dog.bark();
        dog.sayColor();
        Cat cat = new Cat("Kitty", 12, "black");
        cat.sleep();
        cat.move();
        cat.purr();
        Labrador labrador = new Labrador("Peter", 2, "black", "sweety", true);
        labrador.bark();
        Tiger tiger = new Tiger("Alfred", 35, "yellow");
        tiger.move();
        tiger.move(50);
    }
}
