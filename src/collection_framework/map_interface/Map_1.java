package collection_framework.map_interface;

import javax.swing.tree.TreeCellRenderer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_1 {
    public static void main(String[] args) {
        // Map interface is not part of collection interface
        /**
         * Represents a collection of key-value pairs.
         It is part of the Java Collections Framework but does not extend the Collection interface.
         Common implementations include HashMap, TreeMap, and LinkedHashMap.*/


// HashMap is an implementation of the Map interface that uses a hash table for storage.
// It does not guarantee any specific order of the elements.
        Map<String, String> map = new HashMap<>();

// LinkedHashMap is an implementation of the Map interface that uses a hash table and a linked list.
// It maintains the insertion order of the elements.
        Map<String, String> map1 = new LinkedHashMap<>();

// TreeMap is an implementation of the Map interface that uses a red-black tree for storage.
// It guarantees that the elements will be in ascending order of the keys.

        Map<String, String> map2 = new TreeMap<>();


        map.put("us","United states");
        map.put("US","United states");
        map.put("in","India");


        System.out.println(map.containsKey("in"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.getOrDefault("in","Bharat"));
        System.out.println(map.replace("in","India","Bharat"));
        System.out.println(map);
        map.forEach((k,v) -> System.out.println(k+" = "+v ));


    }
}
