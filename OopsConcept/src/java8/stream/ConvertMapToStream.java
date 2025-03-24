package java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ConvertMapToStream {

    public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {
        return map.entrySet().stream();
    }

    public static void main(String[] args) {
        // Create a Map
        Map<Integer, String> mp = new HashMap<>();

        // Add entries to the Map
        mp.put(1, "Geeks");
        mp.put(2, "forGeeks");
        mp.put(3, "A computer Portal");

        // Print the Map
        System.out.println("Map: " + mp);

        for (Map.Entry<Integer, String> m : mp.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


        Stream<Map.Entry<Integer, String>> mapStream = convertMapToStream(mp);
        mapStream.forEach(obj -> System.out.println("key= " + obj.getKey() + " value= " + obj.getValue()));
    }
}
