package Collections.Set_Students;

import Collections.HashMap.Student;

import java.util.*;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Salim", "Oussayfi", 797754);
        Student s2 = new Student("Manuel", "Bongusman", 794388);
        Student s3 = new Student("Mike", "Jastrow", 748547);

        Set<Student> students = new HashSet<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);


        System.out.println(students);
        System.out.println();

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student s = itr.next();
            System.out.print(s + " --- ");


        }

    }
}
