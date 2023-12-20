public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 36;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n) {
        int i = 2;
        while (i < Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}