package Collections.HashMap_Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_Search {

    public static void main(String[] args) {

        Map<String, List<String>> simpleSearchMap = new HashMap<>();
        simpleSearch(simpleSearchMap, "usa", "Los Angeles");
        simpleSearch(simpleSearchMap, "usa", "New York");

        Map<String, List<String>> moreConciseMap = new HashMap<>();
        moreConciseSearch(moreConciseMap, "germany", "Frankfurt");
        moreConciseSearch(moreConciseMap, "usa", "Los Angeles");
        moreConciseSearch(moreConciseMap, "usa", "New York");

        Map<String, List<String>> getOrDefaultMap = new HashMap<>();
        extracted(getOrDefaultMap, "germany", "Frankfurt");
        extracted(getOrDefaultMap, "germany", "Hamburg");
        extracted(getOrDefaultMap, "usa", "New York");

        Map<String, List<String>> computeIfAbsent = new HashMap<>();
        computeIfAbsentMap(computeIfAbsent, "germany", "Frankfurt");
        computeIfAbsentMap(computeIfAbsent, "germany", "Hamburg");
        computeIfAbsentMap(computeIfAbsent, "usa", "New York");
        computeIfAbsentMap(computeIfAbsent, "tunisia", "Tunis");

        
        System.out.println("Value inside? " + searchValue(computeIfAbsent, "germany", "Frankfurt"));
        System.out.println("Value inside? " + searchValue(computeIfAbsent, "germany", "Kassel"));
        

        /**
         * If the country already exists, the method does nothing and returns the existing value associated with the key, but if country is a new string to the map, putIfAbsent()returns null, resulting a NullPointerException .
         */
//        Map<String, List<String>> putIfAbsent = new HashMap<>();
//        putIfAbsentMap(putIfAbsent, "germany", "Frankfurt");
    }

    private static boolean searchValue(Map<String, List<String>> map, String country, String city) {
        if (map.containsKey(country)) {
            List<String> cities = map.get(country);
            return cities.contains(city);
        }
        return false;
    }

    private static void putIfAbsentMap(Map<String, List<String>> map, String country, String city) {
        map.putIfAbsent(country, new ArrayList<>()).add(city);
    }
    private static void computeIfAbsentMap(Map<String, List<String>> map, String country, String city) {
        map.computeIfAbsent(country, k -> new ArrayList<>()).add(city);
        System.out.println("computeIfAbsentMap " + map);
    }
    private static void extracted(Map<String, List<String>> map, String country, String city) {
        map.put(country, map.getOrDefault(country, new ArrayList<>()));
        map.get(country).add(city);
        System.out.println("getOrDefaultMap " + map);
    }
    private static void moreConciseSearch(Map<String, List<String>> map, String country, String city ) {
        if (!map.containsKey(country)) {
            map.put(country, new ArrayList<>());
        }
        map.get(country).add(city);
        System.out.println("moreConciseMap " + map);
    }
    private static void simpleSearch(Map<String, List<String>> map, String country, String city) {
        if (map.containsKey(country)) {
            List<String> cities = map.get(country); // get the list of cities associated with this country
            cities.add(city);
            map.put(country, cities);
        } else { // if this is a new country
            List<String> cities = new ArrayList<>(); // initialized a new array list for this new country
            cities.add(city);
            map.put(country, cities);
        }
        System.out.println("simpleSearchMap " + map);
    }
    private static void simpleSearch2(Map<String, List<String>> map, String country, String city) {
        map.computeIfAbsent(country, k -> new ArrayList<>()).add(city);
        System.out.println("simpleSearchMap " + map);
    }
}
