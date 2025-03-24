package org.example.java8.mapReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> strList = Arrays.asList("rajesh", "kumar", "RAJESHKUMAR");

        int sum = 0;
        for (int v : list) {
            sum += v;
        }
        System.out.println(sum);

        int sum1 = list.stream().mapToInt(i -> i).sum();

        System.out.println(sum1);

        int sum2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);

        Optional<Integer> sum3 = list.stream().reduce(Integer::sum);
        System.out.println(sum3.get());

        Integer maxElement = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxElement);


        // find longestString in the list
        String longestString = strList.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);

        System.out.println(longestString);
    }
}
