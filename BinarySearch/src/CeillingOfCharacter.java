public class CeillingOfCharacter {
    public static void main(String[] args) {
        char[] arr = {
                'x', 'x', 'y','y'
        };

        char target = 'y';
        char ceil = nextGreatestLetter(arr, target);
        System.out.printf("Smallest letter greater than %c is %c", target, ceil);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
