package Composition.simpleExample;

public class Car {
    //Has-a relationship
    private Door door;

    public Car(){
        this.door = new Door();
    }
}
