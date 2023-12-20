import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image={
            {1,1,0},
            {1,0,1},
            {0,0,0},
        };

        flipAndInvertImage(image);

        for (int[] row:image) {
            System.out.println(Arrays.toString(row));
        }


    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            //reverse the array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 - i] ^ 1;
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
    }
}
