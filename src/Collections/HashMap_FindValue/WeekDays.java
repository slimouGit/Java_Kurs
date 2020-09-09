package Collections.HashMap_FindValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeekDays {

    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRYDAY, SATURDAY, SUNDAY;
    }


    public static void main(String[] args) {
        Map<String, DaysOfWeek> weekdays = new LinkedHashMap<>();
        weekdays.put("Monday", DaysOfWeek.MONDAY);
        weekdays.put("Tuesday", DaysOfWeek.TUESDAY);
        weekdays.put("Wednesday", DaysOfWeek.WEDNESDAY);
        weekdays.put("Thursday", DaysOfWeek.THURSDAY);
        weekdays.put("Friday", DaysOfWeek.FRYDAY);
        weekdays.put("Saturday", DaysOfWeek.SATURDAY);
        weekdays.put("Sunday", DaysOfWeek.SUNDAY);

        findEnumDay(weekdays, 2);
    }

    private static void findEnumDay(Map<String, DaysOfWeek> weekdays, int i) {
        weekdays.entrySet().forEach(e -> {
            System.out.println(e.hashCode() + "Key: " + e.getKey() + " Value: " + e.getValue());
        });

        weekdays.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));


        StringBuilder message = new StringBuilder("I like ");
        int counter = 0;
        for (Map.Entry<String, DaysOfWeek> item : weekdays.entrySet()) {
            if (counter == i) {
                message.append(item.getValue().toString());
            }
            counter++;
        }
        System.out.println(message);


        StringBuilder url = new StringBuilder("www.eureka.de/");
        if (i <= weekdays.size()) {
            for (int y = 0; y < weekdays.size(); y++) {
                if (y == i) {
                    url.append(weekdays.values().toArray()[y]);
                }
            }
        }else{
            url.append("NOTHHINGFOUND");
        }
        System.out.println(url);


    }


}
