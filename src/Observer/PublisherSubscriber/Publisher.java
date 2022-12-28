package Observer.PublisherSubscriber;

// Das Interface "Publisher" definiert die Methoden, die ein Publisher bereitstellen muss.
public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
