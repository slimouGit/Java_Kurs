package Comparable.ComparableInterface_Workers;

import java.util.Arrays;

/**
 * Created by salim on 23.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        ComparableInterface_Workers.Worker w1 = new ComparableInterface_Workers.Worker(6, "Anton", "Meier");
        ComparableInterface_Workers.Worker w2 = new ComparableInterface_Workers.Worker(5, "Hans", "Bauer");
        ComparableInterface_Workers.Worker w3 = new ComparableInterface_Workers.Worker(3, "Peter", "Meier");
        ComparableInterface_Workers.Worker w4 = new ComparableInterface_Workers.Worker(2, "Peter", "Meier");
        ComparableInterface_Workers.Worker w5 = new ComparableInterface_Workers.Worker(9, "Stefan", "Brecht");

        ComparableInterface_Workers.Worker[] workers = new ComparableInterface_Workers.Worker[]{w1, w2, w3, w4, w5};

        for (ComparableInterface_Workers.Worker worker : workers) {
            System.out.println(worker.toString());
        }

        System.out.println("\n---------------------------------------------\n");

        Arrays.sort(workers);

        for (ComparableInterface_Workers.Worker worker : workers) {
            System.out.println(worker.toString());
        }


    }
}
