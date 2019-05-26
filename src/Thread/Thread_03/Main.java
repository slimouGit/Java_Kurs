package Thread.Thread_03;

/**
 * Created by salim on 14.04.2019.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Thread startet");
        Thread t1 = new Thread(new Thread_03());
        System.out.println("Thread " +t1.getName()+ " State: "+ t1.getState());
        t1.start();
        System.out.println("Thread " +t1.getName()+ " State: "+ t1.getState());

        Thread t2 = new Thread(new Thread_03(), "zweiter Thread");
        t2.start();
        System.out.println("Main Thread");
        System.out.println("Thread Name: "+ t1.getName());
        System.out.println("Thread Name: "+ t2.getName());
        t1.setName("erster Thread");
        System.out.println("Thread Name: "+ t1.getName());
        System.out.println("Thread " +t1.getName()+ " State: "+ t1.getState());
    }
}
