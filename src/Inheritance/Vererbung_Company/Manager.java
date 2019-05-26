package Vererbung_Company;

/**
 * Created by salim on 05.03.2019.
 */
public class Manager extends Employee {

    private int numberOfEmployees;

    public Manager(String firstName, String lastName, long emplyeeId, int numberOfEmployees) {
        super(firstName, lastName, emplyeeId);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
