package ToString;

/**
 * Created by salim on 20.03.2019.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + ": " + this.age;
    }
}
