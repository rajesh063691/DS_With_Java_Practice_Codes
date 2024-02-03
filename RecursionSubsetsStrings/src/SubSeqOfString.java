import java.util.ArrayList;

public class SubSeqOfString {
    public static void main(String[] args) {
        String str = "abc";
        // strSubsets(str, "");
        //System.out.println(strSubsetsArrayList(str, "", new ArrayList<String>()));
        System.out.println(strSubsetsArrayListOne(str, ""));
        //strSubSeqAscii(str, "");
       // System.out.println(strSubsetsArrayListAscii(str, ""));
    }

    static void strSubsets(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        // take one character and put in inside ans and call again the same function
        strSubsets(str.substring(1), ans + str.charAt(0));
        // ignore one character and put in inside ans and call again the same function
        strSubsets(str.substring(1), ans);
    }

    static ArrayList<String> strSubsetsArrayList(String str, String ans, ArrayList<String> list) {
        if (str.isEmpty()) {
            list.add(ans);
            return list;
        }
        // take one character and put in inside ans and call again the same function
        strSubsetsArrayList(str.substring(1), ans + str.charAt(0), list);
        // ignore one character and put in inside ans and call again the same function
        strSubsetsArrayList(str.substring(1), ans, list);
        return list;
    }

    static ArrayList<String> strSubsetsArrayListOne(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        // take one character and put in inside ans and call again the same function
        ArrayList<String> left = strSubsetsArrayListOne(str.substring(1), ans + str.charAt(0));
        // ignore one character and put in inside ans and call again the same function
        ArrayList<String> right = strSubsetsArrayListOne(str.substring(1), ans);
        left.addAll(right);
        return left;
    }

    static void strSubSeqAscii(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        // take one character and put in inside ans and call again the same function
        strSubSeqAscii(str.substring(1), ans + str.charAt(0));
        // ignore one character and put in inside ans and call again the same function
        strSubSeqAscii(str.substring(1), ans);
        strSubSeqAscii(str.substring(1), ans + (str.charAt(0) + 0));
    }

    static ArrayList<String> strSubsetsArrayListAscii(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        // take one character and put in inside ans and call again the same function
        ArrayList<String> first = strSubsetsArrayListAscii(str.substring(1), ans + ch);
        // ignore one character and put in inside ans and call again the same function
        ArrayList<String> second = strSubsetsArrayListAscii(str.substring(1), ans);
        ArrayList<String> third = strSubsetsArrayListAscii(str.substring(1), ans + (ch + 0));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
