package Vererbung_Company;

/**
 * Created by salim on 05.03.2019.
 */
public class Employee extends Person {

    private long emplyeeId;

    public Employee(String firstName, String lastName, long emplyeeId) {
        super(firstName, lastName);
        this.emplyeeId = emplyeeId;
    }

    public long getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(long emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

}
