package Clone.Clone_Human;

/**
 * Created by salim on 13.04.2019.
 */
public class Main {
    public static void main(String[] args){
        SuperPower invisible = new SuperPower("invisible");
        Human originalHuman = new Human("Stefanie", "Müller", "female", 29, invisible);
        Human clonedHuman = new Human(originalHuman);
        System.out.println(originalHuman);
        System.out.println(clonedHuman);

        clonedHuman.setGender("male");
        clonedHuman.setFirstName("Thomas");
        clonedHuman.getHumanSuperPower().setSuperPower("X-ray vision");

        System.out.println(clonedHuman);
    }
}
