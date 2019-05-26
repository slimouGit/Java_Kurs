package Exception.OwnException;

/**
 * Created by salim on 06.04.2019.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws ToOldException{
        if(this.age>65){
            throw new ToOldException();
        }
        System.out.println("Falsche Berechnung " + (this.age/0));
        System.out.println("person is sprinting");
    }
}
