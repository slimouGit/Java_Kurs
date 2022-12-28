package Observer.PublisherSubscriber;

import java.util.ArrayList;
import java.util.List;

// Die Klasse "NewsPublisher" implementiert das Interface "Publisher" und stellt einen konkreten Publisher dar.
class NewsPublisher implements Publisher {
    private List<Subscriber> subscribers;
    private String message;

    public NewsPublisher() {
        subscribers = new ArrayList<>();
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
            subscriber.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifySubscribers();
    }
}
