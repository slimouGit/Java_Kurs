package Collections.Queues_PriorityQueue_Rescue;

/**
 * Created by salim on 30.03.2019.
 */
public class Injured implements Comparable {
    private String gender;
    private int violation;
    private int age;

    public Injured(String gender, int violation, int age) {
        this.gender = gender;
        this.violation = violation;
        this.age = age;
    }

    @Override
    public String toString(){
        return "rescued: " + this.gender + " age: " + this.age + " violation: " + this.violation;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Injured){
            Injured tmpInjured = (Injured)o;
            if(this.age<tmpInjured.age){
                return -1;
            }
            if(this.age>tmpInjured.age){
                return 1;
            }
            if(this.violation>tmpInjured.violation){
                return -1;
            }
            if(this.violation<tmpInjured.violation){
                return 1;
            }
            if(this.gender.compareTo(tmpInjured.gender) != 0){
                return this.gender.compareTo(tmpInjured.gender);
            }
            return 0;
        }
        return 0;
    }
}
