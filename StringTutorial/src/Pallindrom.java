public class Pallindrom {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPallindrom(str));
    }

    static boolean isPallindrom(String str) {
        // check for empty and null string
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
