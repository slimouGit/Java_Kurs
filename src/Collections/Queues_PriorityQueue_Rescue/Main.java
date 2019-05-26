package Collections.Queues_PriorityQueue_Rescue;

import java.util.PriorityQueue;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {

    public static void main(String[] args){

    PriorityQueue<Injured> victims = new PriorityQueue<>();


    Injured victim_1 = new Injured("m", 8, 32);
    Injured victim_2 = new Injured("m", 3, 5);
    Injured victim_3 = new Injured("f", 10, 5);
    Injured victim_4 = new Injured("m", 5, 10);
    Injured victim_5 = new Injured("f", 6, 20);
    Injured victim_6 = new Injured("f", 4, 40);
    Injured victim_7 = new Injured("f", 8, 40);
    Injured victim_8 = new Injured("m", 5, 80);
    Injured victim_9 = new Injured("f", 5, 80);

    victims.offer(victim_1);
    victims.offer(victim_2);
    victims.offer(victim_3);
    victims.offer(victim_4);
    victims.offer(victim_5);
    victims.offer(victim_6);
    victims.offer(victim_7);
    victims.offer(victim_8);
    victims.offer(victim_9);

    System.out.println("rescue measures");

    while(!victims.isEmpty()){
        System.out.println(victims.poll().toString());
    }

    }
}
