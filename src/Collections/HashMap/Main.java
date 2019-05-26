package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Fake", "Stuident", 797754);
        Student s2 = new Student("Manuel", "Bongusman", 794388);
        Student s3 = new Student("Mike", "Jastrow", 748547);
        Student s4 = new Student("Salim", "Oussayfi", 797754);

        Map<Integer, String> students = new HashMap<>();

        students.put(s1.getMatrikelNr(),s1.toString());
        students.put(s2.getMatrikelNr(),s2.toString());
        students.put(s3.getMatrikelNr(),s3.toString());
        students.put(s4.getMatrikelNr(),s4.toString()); //ueberschreibt s1 wegen key


        System.out.println(students);


    }
}
