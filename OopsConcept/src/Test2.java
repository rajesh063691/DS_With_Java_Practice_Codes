/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG {
    public static void main(String[] args)
    {
        List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> even
                = arr.stream().reduce(new ArrayList<Integer>(),
                (a, b)
                        -> {
                    if (b % 2 == 0)
                        a.add(b);
                    return a;
                },
                (a, b) -> {
                    a.addAll(b);
                    return a;
                });
        System.out.println(even);
    }
}
