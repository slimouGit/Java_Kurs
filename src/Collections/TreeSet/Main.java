package Collections.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Max");
        names.add("Anton");
        names.add("Hanna");
        names.add("Tanja");
        names.add("Anton");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        Student s1 = new Student("Stefanie", 39);
        Student s2 = new Student("Egon", 25);
        Student s3 = new Student("Dirk", 25);
        Student s4 = new Student("Christian", 43);

        //needs comparable interface
        Set<Student> students = new TreeSet<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for(Student student : students){
            System.out.println(student);
        }




    }
}
