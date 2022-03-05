package Optional;

public class Dog {

    private String name;
    private Breed breed;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, Breed breed) {
        this(name);
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
