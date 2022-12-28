package Observer.PublisherSubscriber;

// Die Klasse "NewsSubscriber" implementiert das Interface "Subscriber" und stellt einen konkreten Subscriber dar.
class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " erhält die Nachricht: " + message);
    }
}
