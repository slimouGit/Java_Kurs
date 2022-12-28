package Observer.PublisherSubscriber;

// Das Interface "Subscriber" definiert die Methoden, die ein Subscriber implementieren muss.
interface Subscriber {
    void update(String message);
}
