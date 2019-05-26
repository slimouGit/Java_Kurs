package Equal.Equals;

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

    @Override
    public boolean equals(Object obj){
        boolean isEquals = true;
        if(this == obj){
            isEquals = true;
        }
        if(obj == null){
            isEquals = false;
        }
        if(!(obj instanceof Student)){
            isEquals = false;
        }
        Student tmpStudent = (Student) obj;

        if(!(this.firstName.equals(tmpStudent.firstName))){
            isEquals = false;
        }
        if(!(this.lastName.equals(tmpStudent.lastName))){
            isEquals = false;
        }
        if(!(this.age == tmpStudent.age)){
            isEquals = false;
        }
        return isEquals;
    };
}
