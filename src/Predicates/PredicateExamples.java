package Predicates;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        //Simple predicate example
        Predicate<Integer> lesserthan = i -> (i < 20);
        System.out.println(lesserthan.test(10));
        System.out.println(lesserthan.test(100));

        //two conditions => range
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        // Creating predicates
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); //true
        System.out.println(result);

        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); //false => -15
        System.out.println(result2);

    }
}
