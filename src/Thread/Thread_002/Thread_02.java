package Thread.Thread_002;

/**
 * Created by salim on 14.04.2019.
 */
public class Thread_02 implements Runnable {
        @Override
        public void run() {
            for(int i = 0;i<=15;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
