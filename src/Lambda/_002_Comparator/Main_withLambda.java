package Lambda._002_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by salim on 05.05.2019.
 */
public class Main_withLambda {
    public static void main(String[] args){

        EmployeeLambdaSorted john = new EmployeeLambdaSorted("John Doe", 30);
        EmployeeLambdaSorted susanne = new EmployeeLambdaSorted("Susanne Beaker", 28);
        EmployeeLambdaSorted dave = new EmployeeLambdaSorted("Dave Parker", 35);
        EmployeeLambdaSorted tina = new EmployeeLambdaSorted("Tina Turner", 65);

        List<EmployeeLambdaSorted> employees = new ArrayList<>();

        employees.add(john);
        employees.add(susanne);
        employees.add(dave);
        employees.add(tina);

        System.out.println("\nunsorted:");
        for (EmployeeLambdaSorted employee:employees){
            System.out.println(employee.getName());
        }

        Collections.sort(employees, (EmployeeLambdaSorted e1, EmployeeLambdaSorted e2) ->
            e1.getName().compareTo(e2.getName()));

        System.out.println("\nsorted by comparator (LAMBDA):");
        for (EmployeeLambdaSorted employee:employees){
            System.out.println(employee.getName());
        }
    }
}

class EmployeeLambdaSorted{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeLambdaSorted(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
