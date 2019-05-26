package String.substring;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        String testString = "Das ist ein Haus";

        String subString = testString.substring(4);

        System.out.println(subString);

        String rangeString = testString.substring(4,6);
        System.out.println(rangeString);
    }
}
