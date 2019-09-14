package Composition.Pet;

public class Cat extends Animal {

    Cat(String name){
        super(name);
    }
    void meowing(){
        System.out.println("Cat is meowing");
    }

}
