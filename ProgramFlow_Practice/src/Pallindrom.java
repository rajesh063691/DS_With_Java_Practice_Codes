import java.util.Objects;

public class Pallindrom {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPallindrom(str));
    }

    private static boolean isPallindrom(String str) {
        String[] arr = str.split("");
        int i = 0;
        int len = str.length() - 1;
        while (i < len) {
            if (!Objects.equals(arr[i], arr[len])) {
                return false;
            }
            i++;
            len--;
        }

        return true;
    }
}
