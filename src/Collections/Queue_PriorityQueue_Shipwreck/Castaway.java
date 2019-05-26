package Collections.Queue_PriorityQueue_Shipwreck;

/**
 * Created by salim on 30.03.2019.
 */
public class Castaway implements Comparable {
    private int age;
    private Gender gender;
    private Role role;

    public Castaway(int age, Gender gender, Role role) {
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    @Override
    public String toString() {
        return "rescued " +  this.gender + " age: " + this.age +" role=" + this.role;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Castaway){
            Castaway tmpCastaway = (Castaway)o;

            if(this.role.getState()<tmpCastaway.role.getState()){
                return -1;
            }
            if(this.role.getState()>tmpCastaway.role.getState()){
                return 1;
            }
            if(this.age<tmpCastaway.age){
                return -1;
            }
            if(this.age>tmpCastaway.age){
                return 1;
            }
            if(this.gender.getOrder()<tmpCastaway.gender.getOrder()){
                return -1;
            }
            if(this.gender.getOrder()>tmpCastaway.gender.getOrder()){
                return 1;
            }
        }
        return 0;
    }
}
