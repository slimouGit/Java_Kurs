package Collections.Queues_PriorityQueue;

import java.util.PriorityQueue;

/**
 * Created by salim on 24.03.2019.
 */
public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> iceQueue = new PriorityQueue<>();

        iceQueue.offer("Tanja");
        iceQueue.offer("Anton");
        iceQueue.offer("Peter");
        iceQueue.offer("Julia");

        while(!iceQueue.isEmpty()){
            System.out.println(iceQueue.poll());
        }



    }
}
