public class Stream {
    public static void main(String[] args) {
        String str = "baccappappled";
        //System.out.println(removeAllAs(str, new StringBuilder()));
        // System.out.println(skipApple(str, new StringBuilder()));
        System.out.println(skipAppNotApple(str, new StringBuilder()));
    }

    // by passing answer in argument
    static StringBuilder removeAllAs(String str, StringBuilder ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.charAt(0) != 'a') {
            ans.append(str.charAt(0));
        }
        return removeAllAs(str.substring(1), ans);
    }

    // let's only take string in argument and then return substring.
    static StringBuilder removeAllAs1(String str) {
        StringBuilder builder = new StringBuilder();
        if (str.isEmpty()) {
            return builder;
        }
        if (str.charAt(0) != 'a') {
            builder.append(str.charAt(0));
        }
        StringBuilder ans = removeAllAs1(str.substring(1));
        builder.append(ans);
        return builder;
    }

    static StringBuilder skipApple(String str, StringBuilder ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5), ans);
        } else {
            return skipApple(str.substring(1), ans.append(str.charAt(0)));
        }
    }

    static StringBuilder skipAppNotApple(String str, StringBuilder ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3), ans);
        } else {
            return skipAppNotApple(str.substring(1), ans.append(str.charAt(0)));
        }
    }
}