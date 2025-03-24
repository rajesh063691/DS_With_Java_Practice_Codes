package java8.lamda_expressions;


public class LambdaWithMultipleArgs {
    // operation is implemented using lambda expressions
    interface FuncInter1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lambda expressions above
    interface FuncInter2 {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String[] args) {
        // lambda expression for addition for two parameters
        FuncInter1 add = (x, y) -> x + y;
        FuncInter1 multiply = (x, y) -> x * y;

        LambdaWithMultipleArgs tobj = new LambdaWithMultipleArgs();

        // Add two numbers using lambda expression
        System.out.println("Addition is :: "
                + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is :: "
                + tobj.operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        FuncInter2 msg = (message) -> System.out.println("Hello " + message);
        msg.sayMessage("Rajesh");
    }

}
