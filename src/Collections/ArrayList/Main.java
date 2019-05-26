package Collections.ArrayList;

import java.util.ArrayList;
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
        System.out.println(employees.get(1));
        System.out.println();

        for(String employee:employees){
            System.out.println(employee);
        }

        employees.add(2, "Paula Kohl");

        System.out.println();

        for(String employee:employees){
            System.out.println(employee);
        }

        employees.set(1, "Hendrik Dampf");

        System.out.println();

        for(String employee:employees){
            System.out.println(employee);
        }

        employees.remove(4);

        System.out.println();

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println(employees.contains("Paula Kohl"));

        employees.clear();
        System.out.println(employees.contains("Paula Kohl"));
    }


}
