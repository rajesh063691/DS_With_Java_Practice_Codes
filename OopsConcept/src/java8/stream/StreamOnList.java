package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//class Sorting extends Comparator<ArrayList<Integer>>{
//        @Override
//    public int compare(){
//
//        }
//}

public class StreamOnList {
    public static void main(String[] args) {
        // Creating an ArrayList object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

       //Stream s;

        // Inserting elements to ArrayList class object
        // Custom input integer numbers
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

        // First lets print the collection
        System.out.println("Printing the collection : " + al);

        // Printing new line for better output readability
        System.out.println();

        List<Integer> ls = al.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
        // List<Integer> ls = al.stream().filter(i -> i % 2 == 0).map(i -> i + 10).collect(Collectors.toList());
        //List<Integer> ls = al.stream().filter(i -> i % 2 == 0).filter(i -> i % 3 == 0).collect(Collectors.toList());


        System.out.println("only even elements : " + ls);

        // add 10 to each element in the list

        List<Integer> newList = al.stream().map(i -> i + 10).sorted().collect(Collectors.toList());
        System.out.println("new list after adding 10 in each elements : " + newList);
    }
}
