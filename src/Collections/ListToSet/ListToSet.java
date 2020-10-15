package Collections.ListToSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: salim
 * Date: 15.10.2020 18:08
 */
public class ListToSet {
    public static void main(String[] args){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("kiwi");

        System.out.println(fruitList.size());

        Set<String> fruitSet = fruitList.stream().collect(Collectors.toSet());
        System.out.println(fruitSet.size());
    }


}
