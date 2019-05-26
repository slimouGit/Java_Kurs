package Exception.Exception_throwConditional;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args){
        Person p1 = new Person(90);
        try {
            p1.sprint();
        } catch (Exception e) {
            System.out.println("Wohl zu alt");
//            e.printStackTrace();
        }
    }
}
