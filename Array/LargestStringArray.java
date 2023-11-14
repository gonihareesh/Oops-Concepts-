package Array;

import java.util.*;

public class LargestStringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        String arr[] = new String[size];
        System.out.println("enter the array values");
        for (int i = 0; i < size; i++) {
            arr[i] = s.next();
        }
        System.out.println("input:" + Arrays.toString(arr));
        String largestString = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (largestString .length()< arr[i].length()) {
                largestString = arr[i];
                index = i;

            }
        }

        System.out.println("largestString:" + largestString);
        System.out.println("largestStringIndex:" + index);

    }

}
