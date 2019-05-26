package Thread.Thread_Join;

/**
 * Created by salim on 14.04.2019.
 */
public class Thread_Join implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " itr " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread " + Thread.currentThread().getName() + " beendet");
    }
}
