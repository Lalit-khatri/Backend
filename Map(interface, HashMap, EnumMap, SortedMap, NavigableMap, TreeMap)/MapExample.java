
/**
 * Map in Java: An object that maps keys to values, it cannot contain duplicate keys.
 * Each key can map to at most one value. The Map interface is part of the java.util package 
 * and is implemented by various classes like HashMap, TreeMap, LinkedHashMap, etc
 */


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;



public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);

        System.out.println(map);
        System.out.println(map.get("apple")); // prints 3


        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Wanna need a map that preserves insertion order? Use LinkedHashMap

        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("two", 2);
        linkedMap.put("one", 1);
        linkedMap.put("three", 3);

        System.out.println(linkedMap);

        // When a key is not used, it should be removed from the map automatically
        // Use WeakHashMap for that purpose

        WeakHashMap<String, Integer> weakMap = new WeakHashMap<>();
        String key1 = new String("key1");
        String key2 = new String("key2");

    }
}   