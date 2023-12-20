public class Seive {
    public static void main(String[] args) {
        int n = 30;
        boolean[] primes = new boolean[n + 1];
        isPrime(primes, n);

    }

    static void isPrime(boolean[] primes, int n) {
        for (int i = 2; i * i < n; i++) {
            // here we are considering true is not a prime number , so all its multiplications will also not be a prime number.
            //so mark all multiplication to true.
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
