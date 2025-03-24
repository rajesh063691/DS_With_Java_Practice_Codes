package java8.lamda_expressions;


import java.util.ArrayList;

public class IterateOverList {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));
        System.out.println("Only Even numbers");
        arrL.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    }
}
