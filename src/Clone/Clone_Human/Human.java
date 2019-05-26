package Clone.Clone_Human;

/**
 * Created by salim on 13.04.2019.
 */
public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private SuperPower humanSuperPower;

    public Human(String firstName, String lastName, String gender, int age, SuperPower humanSuperPower) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.humanSuperPower = humanSuperPower;
    }

    //CopyConstructor
    public Human(Human otherHuman){
        this.firstName = otherHuman.getFirstName();
        this.lastName = otherHuman.getLastName();
        this.gender = otherHuman.getGender();
        this.age = otherHuman.getAge();

        SuperPower humanSuperPower = new SuperPower(otherHuman.getHumanSuperPower().getSuperPower());
        this.humanSuperPower = humanSuperPower;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", superPower='" + this.humanSuperPower.getSuperPower() + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SuperPower getHumanSuperPower() {
        return humanSuperPower;
    }

    public void setHumanSuperPower(SuperPower humanSuperPower) {
        this.humanSuperPower = humanSuperPower;
    }
}
