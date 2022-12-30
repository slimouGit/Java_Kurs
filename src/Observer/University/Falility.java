package Observer.University;

import java.util.ArrayList;
import java.util.List;

public class Falility implements Publisher{

    private List<Subscriber> subscribers;
    private String facilityName;

    public Falility() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.enrole(facilityName);
        }
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
        notifySubscribers();
    }
}
