package Array;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int arr[][] = { { 10, 20 }, { 30, 40 } };
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
    }

}
