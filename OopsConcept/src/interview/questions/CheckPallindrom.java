package interview.questions;

public class CheckPallindrom {

    public static boolean checkPallindrom(String str) {

        int start = 0;
        char[] chArr = str.toCharArray();
        int end = chArr.length - 1;

        while (start < end) {
            if (chArr[start] != chArr[end]) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPallindrom("mama"));
    }
}
