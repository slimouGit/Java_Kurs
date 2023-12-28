package Loops;

import java.util.stream.IntStream;

public class LoopsStreams {
    public static void main(String[] args){

        IntStream.range(0, 10).forEach(i -> System.out.println("IntStream range " + i));

        for(int i = 0; i<10;i++){
            System.out.println("For loop " + i );
        }

    }
}
