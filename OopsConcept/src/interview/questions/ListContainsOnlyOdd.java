package interview.questions;

import java.util.ArrayList;
import java.util.List;

public class ListContainsOnlyOdd {

    public static boolean isOnlyOdd(List<Integer> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (int val : list) {
            if (val % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    // using lambda expression
    public static boolean isOnlyOdds(List<Integer> list) {
        if (list.isEmpty()) {
            return false;
        }
        return list.stream().anyMatch(i -> i % 2 != 0);
        //return true;
    }

    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>();
        lt.add(1);
        lt.add(9);
        lt.add(3);
        lt.add(7);
        lt.add(5);

       // System.out.println(isOnlyOdd(lt));
        System.out.println(isOnlyOdds(lt));
    }
}
