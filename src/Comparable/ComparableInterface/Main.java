package ComparableInterface;

import java.util.Arrays;

/**
 * Created by salim on 20.03.2019.
 */
public class Main {
    public static void main(String[] args){

        String[] stringArr = {"Test", "B", "Clone/Clone_False", "F", "Ze"};
        Arrays.sort(stringArr);

        for(String item:stringArr){
            System.out.println(item);
        }

        Student[] students = new Student[3];
        students[0] = new Student("Petra", "Meier", 45);
        students[1] = new Student("Tanja", "Klaus", 66);
        students[2] = new Student("Hans", "Dampf", 54);

        Arrays.sort(students);

        for(Student student:students){
            System.out.println(student);
        }



    }
}
