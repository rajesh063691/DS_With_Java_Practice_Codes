package com.rajesh.randomCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 4, 6, 8, 1, 2, 3, 0, 9, 8);

//        List<Integer> gThan4 = list.stream().filter(i -> i > 4).sorted().collect(Collectors.toList());
//        System.out.println(gThan4);

        //list.stream().filter(i->i>4).sorted().forEach(System.out::println);
        list.stream().filter(i->i>4).sorted().forEach(Streams::printElements);
    }



    public static void printElements(int i){
        System.out.println(i);
    }
}
