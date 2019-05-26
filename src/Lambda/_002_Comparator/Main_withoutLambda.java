package Lambda._002_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by salim on 05.05.2019.
 */
public class Main_withoutLambda {
    public static void main(String[] args){

        //simple lambda example
        new Thread(()->{
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("Line 4");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee susanne = new Employee("Susanne Beaker", 28);
        Employee dave = new Employee("Dave Parker", 35);
        Employee tina = new Employee("Tina Turner", 65);

        List<Employee> employees = new ArrayList<>();

        employees.add(john);
        employees.add(susanne);
        employees.add(dave);
        employees.add(tina);
        System.out.println("\nunsorted:");
        for (Employee employee:employees){
            System.out.println(employee.getName());
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("\nsorted by comparator:");
        for (Employee employee:employees){
            System.out.println(employee.getName());
        }
    }
}

class Employee{
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

    public Employee(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
