package Thread.Thread_Join;

/**
 * Created by salim on 14.04.2019.
 */
public class Main {
    public static void main(String[] args){
        Thread t1 = new Thread(new Thread_Join(), "Thread1");
        t1.setPriority(1);
        t1.start();

        Thread t2 = new Thread(new Thread_Join(), "Thread2");
        t2.setPriority(10);

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Main-Thread
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main-Thread itr " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main Thread beendet");
    }
}
