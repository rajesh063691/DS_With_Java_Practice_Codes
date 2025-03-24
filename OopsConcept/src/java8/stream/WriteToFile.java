package java8.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WriteToFile {
    public static void main(String[] args) {
        String[] words
                = {"Geeks", "for", "Geeks", "Hello", "World"};

        String filepath = "/Users/rajesh/Java_DS_Tutorial/OopsConcept/src/java8/stream/test1.txt";
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(filepath)))) {
            Stream.of(words).forEach(pw::println);
            System.out.println("file written successfully!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
