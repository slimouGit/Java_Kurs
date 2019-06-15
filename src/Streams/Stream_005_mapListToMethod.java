package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;


public class Stream_005_mapListToMethod {
    public static void main(String args[]) {
        List<Integer> number = new ArrayList<>(
                Arrays.asList(2, 3, 4, 5));

        List<Integer> manipulated = number.stream().map(x -> manipulateX(x)).
                collect(Collectors.toList());
        
        out.println(manipulated);
    }

    private static int manipulateX(Integer result) {
        result+=1;
        return result;
    }
}
