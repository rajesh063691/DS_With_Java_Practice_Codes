package java8.lamda_expressions;


interface IsFactorial {
    int fact(int n);

    static String displayMyName() {
        return "Rajesh Kumar";
    }

    default String whatIsMyDesignation() {
        return "Software Engineer";
    }
}

interface MultiplicationFactor {
    boolean isFactor(Integer n, Integer m);
}

interface FuncInterface {
    // single abstract method
    void abstractFun(int x);

    // default method
    default void normalFun() {
        System.out.println("Hello");
    }
}

interface FuncVoidInterface {
    // single abstract method
    void abstractVoidFun();

}

public class TestLambda {
    public static void main(String[] args) {
        // this is a lambda expression
        FuncInterface fobj = (int x) -> {
            System.out.println(2 * x);
        };

        FuncInterface fobj1 = (int x) -> {
            System.out.printf("Square of %d is %d\n", x, x * x);
        };
        fobj.abstractFun(5);
        fobj1.abstractFun(5);

        FuncVoidInterface vobj = () -> {
            System.out.println("I am here to represent void lambda expression");
        };

        vobj.abstractVoidFun();

        MultiplicationFactor factor = (a, b) -> (a % b == 0);
        if (factor.isFactor(10, 2)) {
            System.out.println("2 is the factor of 10");
        }

        if (!factor.isFactor(10, 3)) {
            System.out.println("3 is not a factor of 10");
        }

        IsFactorial fact = (n) -> {
            int ans = -1;
            if (n >= 0) {
                ans = 1;
                for (int i = 1; i <= n; i++) {
                    ans = ans * i;
                }
            }
            return ans;
        };

        System.out.println("factorial of 5 :: " + fact.fact(5));
        System.out.println("My name is :: " + IsFactorial.displayMyName());
        System.out.println("What is my designation :: " + fact.whatIsMyDesignation());
    }
}
