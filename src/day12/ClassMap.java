package day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClassMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Map<String,String> map1 = new LinkedHashMap<>();
        TreeMap<String,String> map2 = new TreeMap<>();

        // HashMap
//        No guaranteed order
//        Output may appear random
//        can be null
        map.put("banana", "yellow");
        map.put("apple", "red");
        map.put("grape", "purple");
        map.put("orange", "orange");
        // both key and value is allowed
        map.put(null,"hi");
        map.put("watermelon", null);
        System.out.println("HashMap "+map.toString());
        map.remove("banana");
        System.out.println("After removing banana: " + map);
        System.out.println("apple? " + map.containsKey("apple"));
        System.out.println("red? " + map.containsValue("red"));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // LinkedHashMap
//        Maintains insertion order
        map1.put("banana", "yellow");
        map1.put("apple", "red");
        map1.put("grape", "purple");
        map1.put("orange", "orange");
        map1.put(null,"hi");
        map1.put("watermelon", null);
        System.out.println("LinkedHashMap "+map1.toString());
        map1.remove("apple");
        map1.put("apple", "red");
        System.out.println("After removing and reinserting apple: " + map1);

        // TreeMap
//        Sorted by keys
//        no null
//        map2.put(null,"hi");
        map2.put("banana", "yellow");
        map2.put("apple", "red");
        map2.put("grape", "purple");
        map2.put("orange", "orange");
        map2.put("watermelon", null);
        System.out.println("TreeMap "+map2.toString());
        map2.put("apple", "green");
        System.out.println("After updating apple: " + map2);
        System.out.println("First key in TreeMap: " + map2.firstKey());
        System.out.println("Last key in TreeMap: " + map2.lastKey());

        String s1= "ABC";
        s1+= "DEF";

        String s2 = "ABC";
        s2 = s2.concat("DEF");
//        ABCDEF

    }

}
