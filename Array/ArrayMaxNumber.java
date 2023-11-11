package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array values");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("input:" + Arrays.toString(arr));
        int largestNumber = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (largestNumber < arr[i]) {
                largestNumber = arr[i];
                index = i;

            }
        }

        System.out.println("largestNumber:" + largestNumber);
        System.out.println("largestNumberIndex:" + index);

    }

}
