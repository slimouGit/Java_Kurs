package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;


public class Stream_001_square {
    public static void main(String args[]) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        out.println(square);
    }
}
