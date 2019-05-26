package Collections.Queue_PriorityQueue_Shipwreck;

/**
 * Created by salim on 30.03.2019.
 */
public enum Gender {
    WOMAN(0),
    MAN(1);

    private final int order;

    Gender(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
}
