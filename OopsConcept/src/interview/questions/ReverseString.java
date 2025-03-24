package interview.questions;


public class ReverseString {
    // function to reverse the string
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // String revStr = "";
        StringBuilder strRev = new StringBuilder();
        String[] strArray = str.split("");
        for (int i = strArray.length - 1; i >= 0; i--) {
            //revStr = revStr + strArray[i];
            strRev.append(strArray[i]);
        }
        return strRev.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("rajesh kumar yadav"));
    }

}
