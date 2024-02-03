import java.util.ArrayList;

public class PhoneNumberCombination {
    public static void main(String[] args) {
        String up = "222";
        //numberCombination("", up);
        //System.out.println(numberCombinationList("", up));
        //System.out.println(numberCombinationCount("", up));
        System.out.println(letterCombinations("", up));


    }

    static void numberCombination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this converts string "2" to integer 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            numberCombination(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> numberCombinationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this converts string "2" to integer 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(numberCombinationList(p + ch, up.substring(1)));
        }
        return ans;
    }

    static int numberCombinationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this converts string "2" to integer 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + numberCombinationCount(p + ch, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // this converts string "2" to integer 2
        int i = (digit - 2) * 3;
        if (digit > 7) {
            i = i + 1;
        }
        int len = i + 3;
        if (digit == 7 || digit == 9) {
            len = len + 1;
        }
        for (; i < len; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(letterCombinations(p + ch, up.substring(1)));
        }
        return ans;
    }


//    static List<String> helper(String ans, String str) {
//        if (str.isEmpty()) {
//            List<String> list = new ArrayList<>();
//            return;
//        }
//        return helper(str.charAt(0) + "", str.substring(1));
//    }

    static String numberString(char ch) {
        return switch (ch) {
            case '2' -> "abc";
            case '3' -> "def";
            case '4' -> "ghi";
            case '5' -> "jkl";
            case '6' -> "mno";
            case '7' -> "pqrs";
            case '8' -> "tuv";
            case '9' -> "wxyz";
            default -> "";
        };
    }
}
