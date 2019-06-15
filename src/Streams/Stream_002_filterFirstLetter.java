package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Stream_002_filterFirstLetter {
    public static void main(String args[]) {
        List<String> names =
                new ArrayList<>(
                Arrays.asList(
                        "Reflection",
                        "Collection",
                        "Stream"
                ));

        names.add("Salomon");

        List<String> result = names.stream().filter(s -> s.startsWith("S")).
                collect(Collectors.toList());

        out.println(result);

        List<String> show =
                result.stream().sorted().collect(Collectors.toList());
        out.println(show);
    }
}
