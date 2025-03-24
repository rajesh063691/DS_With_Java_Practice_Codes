package java8.lamda_expressions;

interface IfOnlyString {
    boolean isAlphabet(String str);
}

public class IfStringContainsOnlyAlpha {

    public static void main(String[] args) {
        String str = "GeekForGeeksRajesh";
        IfOnlyString fun = (s) -> {
            boolean isStrOnly = true;

            //String[] args = s.split("");
            for (char ch : s.toCharArray()) {
                if (ch >= 48 && ch <= 57) return false;
            }
            return isStrOnly;
        };

        System.out.println("Is " + str + " contains only String :: " + fun.isAlphabet(str));
    }
}
