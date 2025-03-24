package java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToMap {

    public static Map streamToMap(String str) {
        Map<String, Integer> map = new HashMap<>();
        Stream<String> stream = Arrays.stream(str.split(" "));

        map = stream.collect(Collectors.toMap(value -> value, value -> value.length()));

        return map;
    }

    public static void main(String[] args) {
        String input = "Geeks for Geek";

        System.out.println(streamToMap(input));
    }

}
