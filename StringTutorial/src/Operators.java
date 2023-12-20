import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+'b');
        System.out.println((char)('a'+'b'));
        // here array Lists toString() will get called and prints empty array []
        System.out.println("Rajesh" + new ArrayList<>());
        // you can not use + with non-primitive
       // System.out.println(new Integer(1) + new ArrayList<>());
    }
}
