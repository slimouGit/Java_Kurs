package Observer.PublisherSubscriber;

public class Main {
    public static void main(String[] args) {
        // Erstelle einen Publisher und zwei Subscriber.
        NewsPublisher publisher = new NewsPublisher();
        NewsSubscriber subscriber1 = new NewsSubscriber("Alice");
        NewsSubscriber subscriber2 = new NewsSubscriber("Bob");

        // Füge die Subscriber dem Publisher hinzu.
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);

        // Setze eine Nachricht und benachrichtige die Subscriber.
        publisher.setMessage("Eilmeldung: Der Himmel fällt!");
    }
}
