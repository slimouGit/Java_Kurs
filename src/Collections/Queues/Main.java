package Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by salim on 24.03.2019.
 */
public class Main {
    public static void main(String[] args) {

        Queue<String> iceQueue = new LinkedList<>();

        iceQueue.offer("Tanja");
        iceQueue.offer("Anton");
        iceQueue.offer("Peter");
        iceQueue.offer("Julia");

        while(!iceQueue.isEmpty()){
            System.out.println(iceQueue.poll());
        }



    }
}
