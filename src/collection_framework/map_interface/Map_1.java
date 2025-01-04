package collection_framework.map_interface;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {
        // Map interface is not part of collection interface
        /**
         * Represents a collection of key-value pairs.
         It is part of the Java Collections Framework but does not extend the Collection interface.
         Common implementations include HashMap, TreeMap, and LinkedHashMap.*/

        Map<String ,String> map = new HashMap<>();
        map.put("us","United states");
        map.put("US","United states");
        map.put("in","India");

        System.out.println(map);
    }
}
