package java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class GetTheFirstEleFromStream {
    public static <T> T getFirstFromStream(Stream<T> stream) {
        T first_stream = stream.reduce((first, second) -> first).orElse(null);

        return first_stream;
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");

        System.out.println("First element in the stream = " + getFirstFromStream(stream));
    }
}
