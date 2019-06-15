package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_003_forEach {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2,3,4,5,2)
        );
        numbers.add(42);
        numbers.add(2);

        System.out.println(numbers);

        // demonstration of forEach method
        numbers.stream().forEach(y->System.out.println(y));

    }
}
