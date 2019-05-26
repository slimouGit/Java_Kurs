package Lambda._001;

/**
 * Created by salim on 05.05.2019.
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the runnable");
            }
        }).start();
        new Thread(new CodeToRun()).start();

        //LAMBDA
        new Thread(()-> System.out.println("Printing from the runnable LAMBDA")).start();
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the runnable from outer class");
    }
}
