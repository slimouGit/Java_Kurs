package Collections.Iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {
    public static void main(String[] args) {

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

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            System.out.print(s + " --- ");

            if (s.getAge() < 30) {
                itr.remove();
            }
        }

        System.out.println();
        System.out.println(students.toString());


    }
}
