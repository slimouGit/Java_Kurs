package Equal.Equals;

/**
 * Created by salim on 20.03.2019.
 */
public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Hans", "Dampf", 66);
        Student s2 = new Student("Hans", "Dampf", 66);

        System.out.println(s1);
        System.out.println(s2);


        System.out.println(s1.equals(s2));
    }
}
