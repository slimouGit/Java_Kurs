package Collections.HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();

        emails.add("oussayfi@gmail.com");
        emails.add("smartillmer@gmail.com");
        emails.add("oussayfi@gmail.com");
        emails.add("max@mustermann.de");
        emails.add("salim@slimou.de");


        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println();

        emails.remove("max@mustermann.de");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println();
        if(emails.contains("smartillmer@gmail.com")){
            System.out.println("vorhanden");
        }else{
            System.out.println("nicht vorhanden");
        }
    }
}
