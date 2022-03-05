package Optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        System.out.println("OPTIONAL");

        Dog d1 = new Dog("Gaston");
        Optional<Dog> optD1 = Optional.of(d1);
        Dog testOptDog1 = optD1.orElse(new Dog("Gasti", new Breed("Münsterländer-Mischling")));
        System.out.println(testOptDog1.getName() + " " + testOptDog1.getBreed()); //Gaston null
        Optional<Breed> optBreed = Optional.ofNullable(d1.getBreed());
        optBreed.ifPresent(System.out::println);
        if (!optBreed.isPresent()) {
            System.out.println("No breed for optBreed");
        }


        System.out.println("---------------------------------------");


        Dog d2 = new Dog("Gaston");
        Optional<Breed> optBreedD1 = Optional.ofNullable(d2.getBreed());
        Breed testDog1Breed = optBreedD1.orElse(new Breed("Super Gasti Rasse"));

        System.out.println("Dog 2 " + testDog1Breed.getDogbreed()); //Dog 2 Super Gasti Rasse
        System.out.println("Dog 2 " + d2.getName() + " is breed set " + (null != d2.getBreed())); //Dog 2 Gaston is breed set false

        if(optBreedD1.isPresent()){
            System.out.println("Dogs breed " + d2.getBreed()); //Wird nicht gedruckt
        }else{
            d2.setBreed(testDog1Breed);
            System.out.println("Dogs new breed " + d2.getBreed().getDogbreed()); //wird gedruckt
        }
        System.out.println("Dog 2 " + d2.getName() + " is breed set " + (null != d2.getBreed()));


        System.out.println("---------------------------------------");


        List<Dog> dogs = Arrays.asList(
                new Dog("Wuff", new Breed("Schäferhund")),
                new Dog("Bello", new Breed("Dackel")),
                new Dog("Hund", new Breed("Dackel"))
        );
        List<Breed> breeds = new ArrayList<>();
        for (Dog d : dogs) {
            breeds.add(d.getBreed());
            System.out.println("Loop " + d.getBreed().getDogbreed());
        }
        Optional<Breed> emptyBreed = Optional.empty();
        emptyBreed = breeds.stream().findFirst();
        emptyBreed.ifPresent(b -> System.out.println("Empty breed " + b.getDogbreed())); //Schäferhund




        System.out.println("---------------------------------------");


        Dog superDog = new Dog("Gaston", new Breed("Münsterländer-Mischling"));
        System.out.println("Dog 2 " + superDog.getName() + " is breed set " + (null != superDog.getBreed())); //Dog 2 Gaston is breed set true
        Optional<Dog> emptyOptionalDog = Optional.empty();

        superDog = emptyOptionalDog.orElse(new Dog("Hanno"));
        System.out.println(emptyOptionalDog.isPresent()); //FALSE
        System.out.println(null != superDog); //TRUE

        Dog testDog = emptyOptionalDog.orElse(new Dog("Bello"));

        System.out.println(superDog.getName()); //Hanno

        System.out.println(testDog.getName()); // Bello


    }
}
