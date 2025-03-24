package java8;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Class 5
// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        int[] a=new int[5];
        a[0]=10;
        a[1]=20;

        IntStream st= Arrays.stream(a);
        st.forEach(
                (b)->{
                    if(b!=0){
                        System.out.println(b);
                    }
                }
        );

    }
}
