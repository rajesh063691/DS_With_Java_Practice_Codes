package org.example.sess32recursion;

public class RemoveFromString {
    public static void main(String[] args) {
        String str = "dcabacappleappd";
//skip("", str);
        System.out.println(skipAppNotApple(str));
    }


    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipApple(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return skipApple(p, up.substring(5));
        } else {
            return skipApple(p + ch, up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return ch + skipAppNotApple(up.substring(1));
        }
    }
}
