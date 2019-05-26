package ComparableInterface;

/**
 * Created by salim on 20.03.2019.
 */
public class Student implements Comparable {
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



    //return Clone: wenn uebergebenes Objekt o an die gleiche Sortierstelle gehört, wie das vorliegende Objekt
    //return >Clone: wenn uebergebenes Objekt o HINTER das vorliegende Objekt
    //return <Clone: wenn uebergebenes Objekt o VOR das vorliegende Objekt

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Student){
            Student tmpStudent = (Student) o;
            if(this.age < tmpStudent.age){
                return -1;
            }
            if(this.age > tmpStudent.age){
                return 1;
            }
            return 0;
        }
        return 0;
    }
}
