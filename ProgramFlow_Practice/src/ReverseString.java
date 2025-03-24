public class ReverseString {
    public static void main(String[] args) {
        String str = "Rajesh";
        String nStr = "";
        char ch;

        // 1 way
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            nStr = ch + nStr;
//        }

        // another way
        for (int i = str.length() - 1; i >= 0; i--) {
            nStr = nStr + str.charAt(i);
        }

        System.out.println(nStr);
    }
}
