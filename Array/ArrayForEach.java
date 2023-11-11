package Array;

import java.io.IOException;

public class ArrayForEach {
    public static void main(String[] args) {
        int arr[][] = { { 2, 3, 4, 6 }, { 4, 5, 9, 9 }, { 5, 6, 0, 1 }, { 3, 5, 7, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
