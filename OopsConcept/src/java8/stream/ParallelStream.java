package java8.stream;

import java.util.*;
import java.io.*;

public class ParallelStream {
    public static void main(String[] args) {
        // create a list
        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        list.parallelStream().forEachOrdered(
                System.out::println
        );

    }
}
