import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
        //permutations("", up);
        System.out.println(permutationsArrayList("", up));
        //System.out.println(permutationsCount("", up));

    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // recursion call will happen for processed length+1 times because here we do not know how many times recursion call will happen
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            permutations(first + ch + last, up.substring(1));
        }
    }

    static ArrayList<String> permutationsArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            ArrayList<String> singleList = permutationsArrayList(first + ch + last, up.substring(1));
            ans.addAll(singleList);
        }
        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            count = count + permutationsCount(first + ch + last, up.substring(1));
        }
        return count;
    }
}
