package Exception.OwnExceptionWithMessage;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args){
        Person p1 = new Person(90);
        try {
            p1.sprint();
        } catch (ToOldException e) {
            System.out.println("Wohl zu alt");
            System.out.println("Ausführen nicht möglich, weil: " + e.getMessage());
        }
    }
}
