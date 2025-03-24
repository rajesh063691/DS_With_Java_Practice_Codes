package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnListOfString {
    public static void main(String[] args) {
        // Creating an instance of list
        List<String> companyList = new ArrayList<>();

        // Adding elements using add() method
        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");

        // create comparator to sort the String
        Comparator<String> comp = (String o1, String o2) -> o1.compareTo(o2);
        //List<String> sortedList = companyList.stream().sorted(comp).collect(Collectors.toList());
        companyList.stream().sorted(comp).forEach(System.out::println);
        //System.out.println(sortedList);

    }
}
