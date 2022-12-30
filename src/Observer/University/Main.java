package Observer.University;


public class Main {
    public static void main(String[] args) {
        // Erstelle einen Publisher und zwei Subscriber.
        Falility publisher1 = new Falility();
        Student student1 = new Student(42, "Mimi");
        Student student2 = new Student(33, "Slimou");

        Falility publisher2 = new Falility();
        Student student3 = new Student(50, "Welde");

        // Füge die Subscriber dem Publisher hinzu.
        publisher1.addSubscriber(student1);
        publisher1.addSubscriber(student2);
        publisher2.addSubscriber(student3);

        // Setze eine Nachricht und benachrichtige die Subscriber.
        publisher1.setFacilityName("Beuth Hochschule");
        publisher2.setFacilityName("TU Hagen");
    }
}
