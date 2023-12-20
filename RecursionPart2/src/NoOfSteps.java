public class NoOfSteps {
    public static void main(String[] args) {
        int num = 41;
        System.out.println(numberOfSteps(num));
    }

    static int numberOfSteps(int num) {
        int stepCount = 0;
        return countSteps(num, stepCount);
    }

    private static int countSteps(int num, int stepCount) {
        if (num == 0) {
            return stepCount;
        }
        if (num % 2 == 0) {
            return countSteps(num / 2, stepCount + 1);
        } else {
            return countSteps(num - 1, stepCount + 1);
        }
    }
}
