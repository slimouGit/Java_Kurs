package Composition.simpleExample;

public class Car {
    //Has-a relationship
    private Door door;

    public Car(){
        this.door = new Door();
    }
    
    public static void main(String[] args){
        Car car = new Car();
        car.door.openDoor();
    }
}
