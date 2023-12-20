public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
        System.out.println("was waiting from P(1) to return and now Got return from P(1), So, I am executing now.");
    }

    static void print(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print(n + 1);
        System.out.printf("%dth caller is waiting when n value was =%d \n",n,n);
    }
}
