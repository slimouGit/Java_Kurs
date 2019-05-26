package Exception.Exception_throwConditional;

/**
 * Created by salim on 06.04.2019.
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws Exception{
        if(this.age>65){
            throw new Exception();
        }
        System.out.println("person is sprinting");
    }
}
