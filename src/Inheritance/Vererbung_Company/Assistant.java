package Vererbung_Company;

/**
 * Created by salim on 05.03.2019.
 */
public class Assistant extends Employee {

    private int hoursPerWeek;
    private long managerId;

    public Assistant(String firstName, String lastName, long emplyeeId, int hoursPerWeek, long managerId) {
        super(firstName, lastName, emplyeeId);
        this.hoursPerWeek = hoursPerWeek;
        this.managerId = managerId;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public void isManagerBy(Manager manager){
        if(this.managerId==manager.getEmplyeeId()){
            System.out.println("Manager " + manager.getLastName() + " is the manager by employee " + this.getLastName());
        }else{
            System.out.println("Manager " + manager.getLastName() + " is NOT the manager by employee " + this.getLastName());
        }
    }
}
