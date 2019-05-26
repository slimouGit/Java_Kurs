package Exception.Exceptions_try_catch;

/**
 * Created by salim on 06.04.2019.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws ToOldException {
        int toOldFrom = 65;
        if(this.age>toOldFrom){
            throw new ToOldException("Älter als " + toOldFrom);
        }
        System.out.println("person is sprinting");
    }
}
