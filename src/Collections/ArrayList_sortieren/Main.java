package Collections.ArrayList_sortieren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by salim on 24.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Tanja Schüler");
        employees.add("Hendrik Maier");
        employees.add("Thomas Bäcker");
        employees.add("Britta Schulz");

        for(String employee:employees){
            System.out.println(employee);
        }

        Collections.sort(employees);

        System.out.println();

        for(String employee:employees){
            System.out.println(employee);
        }
    }
}
