package maps;

import collections.DayOfTheWeek;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("4", "Jan Kowalski");
        map.put("2", "Krystian Kowalski");

        System.out.println(map);

        System.out.println(map.get("2"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsValue("Jan Kowalski"));

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        Map<DayOfTheWeek, String> dayOfTheWeekStringMap = new EnumMap<>(DayOfTheWeek.class);
        dayOfTheWeekStringMap.put(DayOfTheWeek.MONDAY, "Work");
        dayOfTheWeekStringMap.put(DayOfTheWeek.TUESDAY, "Work");
        dayOfTheWeekStringMap.put(DayOfTheWeek.WEDNESDAY, "Free time");
        dayOfTheWeekStringMap.put(DayOfTheWeek.THURSDAY, "Work");
        dayOfTheWeekStringMap.put(DayOfTheWeek.FRIDAY, "Work");
        dayOfTheWeekStringMap.put(DayOfTheWeek.SATURDAY, "Free time");
        dayOfTheWeekStringMap.put(DayOfTheWeek.SUNDAY, "Free time");

        System.out.println(dayOfTheWeekStringMap.get(DayOfTheWeek.SUNDAY));

    }
}
