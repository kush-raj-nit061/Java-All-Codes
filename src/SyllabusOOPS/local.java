package SyllabusOOPS;

import java.util.*;

public class local {



        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("user1", 5);
            map.put("user2", 10);
            map.put("user3", 7);
            map.put("user4", 8);

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            Collections.sort(list, (entry1, entry2) ->
                    Integer.compare(entry2.getValue(), entry1.getValue()));

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            // Printing the sorted map
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }

}