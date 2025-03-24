package interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing {

    public static void main(String[] args) {

        final int a=10;
       //s a=11;
        final List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);

        System.out.println(list);

        List<Integer> newList= Collections.unmodifiableList(list);
       // newList.add(30);

        System.out.println(newList);

    }
}
