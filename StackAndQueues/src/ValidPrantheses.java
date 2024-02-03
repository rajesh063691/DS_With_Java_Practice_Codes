import java.util.Stack;

public class ValidPrantheses {
    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chArr = s.toCharArray();

        for (char ch : chArr) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{' ) {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[' ) {
                        return false;
                    }
                }

            }
        }

        return stack.isEmpty();
    }

}
