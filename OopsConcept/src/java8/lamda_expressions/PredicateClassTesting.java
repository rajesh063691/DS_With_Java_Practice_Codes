package java8.lamda_expressions;

import java.util.function.Predicate;

public class PredicateClassTesting {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 2 even ? " + isEven.test(-6));

        Predicate<Integer> isEvenAndOdd = isEven.and(n -> n > 0);
        System.out.println("Is 6 even and positive ? " + isEvenAndOdd.test(-6));
    }
}
