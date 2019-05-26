package String.lastIndexOf;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args){
        String testString = "Das ist ein Haus";

        System.out.println(testString.lastIndexOf('a'));
        System.out.println(testString.lastIndexOf('a', 4));
        System.out.println(testString.lastIndexOf("ist"));
    }
}
