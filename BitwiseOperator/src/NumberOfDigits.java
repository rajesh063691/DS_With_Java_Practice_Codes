public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        // by formula - int(logn (base b))+1
        int digit = (int) (Math.log(n) / Math.log(b)) + 1;
        // by counting each digit
        System.out.println(noOfDigit(n));
        //System.out.println(digit);
    }

    static int noOfDigit(int n) {
        int noOfDigit = 0;

        while (n > 0) {
            noOfDigit++;
            n = n >> 1;
        }
        return noOfDigit;
    }
}
