package Collections.ArrayList_Company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by salim on 24.03.2019.
 */
public class Main {
    public static void main(String[] args){

        Employee e1 = new Employee(12, "Stefan", "Bach", 52000);
        Employee e2 = new Employee(5, "Tanja", "Kruger", 48000);
        Employee e3 = new Employee(8, "Thomas", "Stein", 64000);
        Employee e4 = new Employee(15, "Tina", "Sandmann", 56000);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Manager<Employee> manager = new Manager<>(e1);
        manager.printObject(e1);

        Cow cow1 = new Cow("Berta", 500, 3);
        Manager<Cow> managedCow = new Manager<>(cow1);
        managedCow.printObject(cow1);

        System.out.println();

        for(Employee employee:employees){
            System.out.println(employee.toString());
        }

        Employee e5 = new Employee(18, "Maria", "Berg", 25000);
        hireEmployee(e5, employees);

        System.out.println();
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }

        leaveCompany(e2,employees);

        System.out.println();
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }

        raiseSallary(e5,10000);

        System.out.println();
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }

        Collections.sort(employees);

        System.out.println();
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }
    }

    public static List<Employee> hireEmployee(Employee obj, List<Employee> list){
        System.out.println();
        System.out.println(obj.getFirstName() + "" + obj.getLastName() + " wurde angestellt");
        list.add(obj);
        return list;
    }

    public static List<Employee> leaveCompany(Employee obj, List<Employee> list){
        System.out.println();
        System.out.println(obj.getFirstName() + " " + obj.getLastName() + " hat gekündigt");
        list.remove(obj);
        return list;
    }

    public static void raiseSallary(Employee obj, double amount){
        System.out.println();
        System.out.println(obj.getFirstName() + " " + obj.getLastName() + " hat eine Gehaltserhöhung von " + amount + " Euro bekommen");
        double raisedSallary = obj.getSallary()+amount;
        obj.setSallary(raisedSallary);
    }

}
