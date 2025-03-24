public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }

    private static boolean isPrime(int num) {
        int i = 2;
        while (i  < Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
