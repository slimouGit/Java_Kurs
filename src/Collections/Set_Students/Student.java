package Collections.Set_Students;

/**
 * Created by salim on 30.03.2019.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int matrikelNr;

    public Student(String firstName, String lastName, int matrikelNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }
}
