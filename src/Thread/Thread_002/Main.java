package Thread.Thread_002;

/**
 * Created by salim on 14.04.2019.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Thread startet");
        Thread t1 = new Thread(new Thread_02());
        t1.start();

        Thread t2 = new Thread(new Thread_02());
        t2.start();
        System.out.println("Main Thread");
    }
}
