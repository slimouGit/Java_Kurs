package Collections.Iterator;

/**
 * Created by salim on 30.03.2019.
 */
public class Student implements Comparable {
    private String firstname;
    private int age;

    public Student(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student tmpStudent = (Student) o;
            if(this.firstname.compareTo(tmpStudent.firstname)!=0){
                return this.firstname.compareTo(tmpStudent.firstname);
            }
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

    @Override
    public String toString() {
        return firstname + " " +  age;
    }
}
