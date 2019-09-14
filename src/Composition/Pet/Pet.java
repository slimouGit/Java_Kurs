package Composition.Pet;

public class Pet {
    private Animal animal;
    private Dog dog;
    private Cat cat;

    Pet(){
        this.dog = new Dog("Gaston");
        this.cat = new Cat("Garfield");
        this.animal = new Animal();
    }

    public static void main(String[] args){
        Pet pet = new Pet();

        pet.cat.meowing();
        pet.dog.barking();

        pet.animal.pooping(pet.cat.getName());
        pet.animal.pooping(pet.dog.getName());

    }
}
