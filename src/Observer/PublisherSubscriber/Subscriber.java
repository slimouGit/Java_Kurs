package Observer.PublisherSubscriber;

// Das Interface "Subscriber" definiert die Methoden, die ein Subscriber implementieren muss.
public interface Subscriber {
    void update(String message);
}
