package Collections.Queue_PriorityQueue_Shipwreck;

import java.util.PriorityQueue;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {
    public static void main(String[] args){

        Castaway c1 = new Castaway(50, Gender.MAN, Role.EMPLOYEE);
        Castaway c2 = new Castaway(6, Gender.MAN, Role.PASSENGER);
        Castaway c3 = new Castaway(30, Gender.WOMAN, Role.EMPLOYEE);
        Castaway c4 = new Castaway(25, Gender.MAN, Role.PASSENGER);
        Castaway c5 = new Castaway(30, Gender.MAN, Role.PASSENGER);
        Castaway c6 = new Castaway(64, Gender.MAN, Role.CAPTAIN);
        Castaway c7 = new Castaway(40, Gender.MAN, Role.EMPLOYEE);
        Castaway c8 = new Castaway(40, Gender.MAN, Role.PASSENGER);
        Castaway c9 = new Castaway(40, Gender.WOMAN, Role.PASSENGER);
        Castaway c10 = new Castaway(40, Gender.WOMAN, Role.EMPLOYEE);
        Castaway c11 = new Castaway(6, Gender.WOMAN, Role.PASSENGER);

        PriorityQueue<Castaway> wreckQueue = new PriorityQueue<>();
        wreckQueue.offer(c1);
        wreckQueue.offer(c2);
        wreckQueue.offer(c3);
        wreckQueue.offer(c4);
        wreckQueue.offer(c5);
        wreckQueue.offer(c6);
        wreckQueue.offer(c7);
        wreckQueue.offer(c8);
        wreckQueue.offer(c9);
        wreckQueue.offer(c10);
        wreckQueue.offer(c11);

        while(!wreckQueue.isEmpty()){
            System.out.println(wreckQueue.poll().toString());
        }


    }
}
