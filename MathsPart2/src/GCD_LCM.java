public class GCD_LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 28;
        System.out.println(gcd(a, b));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

}
