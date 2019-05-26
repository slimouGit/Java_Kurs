package Collections.Queue_PriorityQueue_Shipwreck;

/**
 * Created by salim on 30.03.2019.
 */
public enum Role {
    PASSENGER(0),
    EMPLOYEE(1),
    CAPTAIN(2);

    private final int state;

    Role(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
