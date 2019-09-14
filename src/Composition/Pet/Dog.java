package Composition.Pet;

public class Dog extends Animal {
    Dog(String name){
        super(name);
    }
    void barking(){
        System.out.println("Dog is barking");
    }

}
