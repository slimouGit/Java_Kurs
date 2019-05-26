package Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by salim on 24.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();
        employees.add("Tanja Schüler");
        employees.add("Hendrik Maier");
        employees.add("Thomas Bäcker");
        employees.add("Britta Schulz");

        for (String employee : employees) {
            System.out.println(employee);
        }
        employees.addFirst("Mimi Illmer");
        employees.addLast("James Last");

        System.out.println();
        for (String employee : employees) {
            System.out.println(employee);
        }

        employees.remove("Thomas Bäcker");

        System.out.println();
        for (String employee : employees) {
            System.out.println(employee);
        }


        employees.removeLast();

        System.out.println();
        for (String employee : employees) {
            System.out.println(employee);
        }


    }
}
