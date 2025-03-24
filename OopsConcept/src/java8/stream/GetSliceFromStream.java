package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GetSliceFromStream {

    public static <T> Stream<T> getSliceOfStream(Stream<T> stream, int startIndex, int endIndex) {
        return stream.skip(startIndex).limit((endIndex - startIndex) + 1);
    }

    public static void main(String[] args) {
        // Create a new List with values 11 - 20
        List<Integer> list = new ArrayList<>();
        for (int i = 11; i <= 20; i++) {
            list.add(i);
        }

        Stream<Integer> stream = getSliceOfStream(list.stream(), 5, 10);

        System.out.print("[");
        stream.forEach(e -> System.out.print(e + " "));
        System.out.print("]");
        System.out.println();

    }
}
