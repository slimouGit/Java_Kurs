package Comparable.ComparableInterface_Workers;

import java.util.Arrays;

/**
 * Created by salim on 23.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker(6, "Anton", "Meier");
        Worker w2 = new Worker(5, "Hans", "Bauer");
        Worker w3 = new Worker(3, "Peter", "Meier");
        Worker w4 = new Worker(2, "Peter", "Meier");
        Worker w5 = new Worker(9, "Stefan", "Brecht");

        Worker[] workers = new Worker[]{w1, w2, w3, w4, w5};

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }

        System.out.println("\n---------------------------------------------\n");

        Arrays.sort(workers);

        for (Worker worker : workers) {
            System.out.println(worker.toString());
        }


    }
}
