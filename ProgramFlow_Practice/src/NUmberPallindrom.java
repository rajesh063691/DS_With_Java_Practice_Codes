public class NUmberPallindrom {
    public static void main(String[] args) {
        int num = 10101;
        // you can convert it to string and then try matching 1st and last using 2 pointer method
//        String str = "" + num;
//        System.out.println(str);
//        System.out.println(str.length());
        System.out.println(isPallindrom(num));
    }

    private static boolean isPallindrom(int num) {
        if (num >= 0 && num <= 9) {
            return true;
        }

        int revNum = 0;
        int rem = 0;
        int tempNum = num;
        while (num > 0) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }

        if (tempNum == revNum) {
            return true;
        }
        return false;
    }
}
