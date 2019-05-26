package Thread.Thread_001;

/**
 * Created by salim on 08.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Thread startet");
        Thread_01 t1 = new Thread_01();
        t1.start();

        Thread_01 t2 = new Thread_01();
        t2.start();
    }
}
