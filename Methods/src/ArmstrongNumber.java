public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Print all the armstrong numbers between 1:1000");
        int i=1;
        boolean isArm=false;
        while (i<100000){
            isArm=IsArmstrong(i);
            if (isArm){
                System.out.printf("%d :: %b\n",i,true);
            }
            i++;
        }

    }

    static boolean IsArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }
        return sum == original;
    }
}
