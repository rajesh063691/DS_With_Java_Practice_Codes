import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,60};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements to search :: ");
        int item = sc.nextInt();
        int fIndex= LinearSearch(arr,item);
        if (fIndex == -1){
            System.out.printf("Item :: %d not found \n",item);
            return;
        }
        System.out.printf("Item :: %d found at index :: %d \n",item,fIndex);
    }

    static int LinearSearch(int[] arr, int item){
        int arrLength = arr.length;
        // if array is empty
        if (arrLength==0){
            return -1;
        }
        for (int i = 0; i < arrLength; i++) {
            if (arr[i]==item){
                return i;
            }
        }
        // this will return if none of the above will execute - so array is not empty and element not found. so return -1
        return -1;
    }
}