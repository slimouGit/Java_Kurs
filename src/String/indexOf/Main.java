package String.indexOf;

/**
 * Created by salim on 06.04.2019.
 */
public class Main {

    public static void main(String[] args){
        String testString = "Das ist ein Haus";

        System.out.println(testString.indexOf('y'));
        System.out.println(testString.indexOf('a'));

        int startToSearch = testString.indexOf('a');

        System.out.println(testString.indexOf('a', startToSearch+1));

        System.out.println(testString.indexOf("ist"));
    }
}
