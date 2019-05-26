package Exception.OwnException;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args){
        Person p1 = new Person(10);
        try {
            p1.sprint();
        } catch (ToOldException e) {
            System.out.println("Wohl zu alt");
        }catch (ArithmeticException e){
            System.out.println("Durch Null darf nicht geteilt werden");
        }
    }
}
