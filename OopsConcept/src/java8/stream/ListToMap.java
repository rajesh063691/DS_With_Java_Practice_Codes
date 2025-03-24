package java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {

    public static Map<String, Long> getNamesOccurances(List<String> list) {
        Map<String, Long> mp = new HashMap<>();
        mp=list.stream().collect(
                Collectors.groupingBy(name -> name, Collectors.counting())
        );

        return mp;
    }

    public static void main(String[] args) {
        List<String> lt=new ArrayList<>();
        lt.add("Rajesh");
        lt.add("Puja");
        lt.add("Rajesh");
        lt.add("Puja");

        System.out.println(getNamesOccurances(lt));
    }
}
