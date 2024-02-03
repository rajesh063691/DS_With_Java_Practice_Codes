import java.util.Stack;

public class MinimumParantheses {
    public static void main(String[] args) {
        String str = "(()))";
        System.out.println(minInsertions(str));
    }

    static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chArr = s.toCharArray();
        int count = 0;

        for (char ch : chArr) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        count++;
                    }
                }
            }
        }

        return stack.size() + count;
    }

    static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chArr = s.toCharArray();
        int count = 0;
        int checkCount = 0;

        for (char ch : chArr) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    checkCount++;
                    if (checkCount == 2) {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        } else {
                            count += 1;
                        }
                        checkCount = 0;
                    }
                }
            }
        }
//        int ans = 0;
//        if (checkCount % 2 != 0) {
//            ans = (stack.size() + count) * 2;
//        }

        return (stack.size() + count) * 2;
    }
}


