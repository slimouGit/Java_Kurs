package Collections.ArrayList_Company;

/**
 * Created by salim on 24.03.2019.
 */
public class Employee implements Comparable {
    private int id;
    private String firstName;
    private String lastName;
    private double sallary;

    public Employee(int id, String firstName, String lastName, double sallary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "ID " + this.id + "\t- " + this.firstName + " " + this.lastName + "\t\t(" + this.sallary + " Euro)";
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee tmpEmployee = (Employee) o;
            if(this.sallary>((Employee) o).sallary){
                return 1;
            }
            if(this.sallary<((Employee) o).sallary){
                return -1;
            }
        }
        return 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

}
