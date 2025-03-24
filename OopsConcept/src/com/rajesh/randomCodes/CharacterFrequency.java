package com.rajesh.randomCodes;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "rajeshrajesh";


        Map<String, Long> mp = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mp);
    }
}
