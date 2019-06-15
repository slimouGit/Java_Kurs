package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_004_convertToSet {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2,3,4,5,2)
        );
        numbers.add(42);
        numbers.add(2);

        System.out.println(numbers);


        Set<Integer> squareSet =
                numbers.stream().collect(Collectors.toSet());
        System.out.println(squareSet);

    }
}
