package java8.stream;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFromFile {
    public static List<String> filterAndConvertToUpper(Stream<String> stream, int len) {
        List<String> ans = stream.filter(s -> s.length() <= len).map(String::toUpperCase).collect(Collectors.toList());
        return ans;
    }

    public static void main(String[] args) {
        String filepath = "/Users/rajesh/Java_DS_Tutorial/OopsConcept/src/java8/stream/test.txt";

        try (Stream<String> lines = Files.lines(Paths.get(filepath))) {
            List<String> filteredStrings = ReadFromFile.filterAndConvertToUpper(lines, 15);
            System.out.println(
                    "Filtered strings with length 5 (converted to uppercase): "
                            + filteredStrings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
