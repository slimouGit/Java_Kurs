package Thread.Thread_001;

/**
 * Created by salim on 08.04.2019.
 */
public class Thread_01 extends Thread {

    @Override
    public void run() {
        super.run();
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
