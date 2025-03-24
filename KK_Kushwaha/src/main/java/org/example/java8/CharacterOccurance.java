package org.example.java8;


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterOccurance {
    public static void main(String[] args) {
        String input = "ilovejavatechie";

        // find each occurance
        Map<String, Long> mp = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mp);


        // find duplicate character in a string

        List<String> duplicate = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicate);


        // find unique elements in given string
        List<String> unique = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());


        // first non-repeating character
        String firstOccurance = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

        // second highest element in array

        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        Integer intList = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();


        // find longest string from given array
        String[] arr = {"java", "tecthie", "springboot", "microservcies"};

        String s = Arrays.stream(arr).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();


        int[] number = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};
        // find all elements starts with 1
        List<String> collect = Arrays.stream(number).boxed()
                .map(v -> v + "")
                .filter(t -> t.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}

