public class EvenOdd {
    public static void main(String[] args) {

        int a = 68;

        System.out.println(isOdd(a));

    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}