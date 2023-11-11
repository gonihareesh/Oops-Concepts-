package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // first array
        System.out.println("enter the array  first size");
        int size1 = s.nextInt();
        String arr1[] = new String[size1];
        System.out.println("ente the array1 elements");
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.next();
        }
        // second array
        System.out.println("enter the array  second size");
        int size2 = s.nextInt();
        String arr2[] = new String[size2];
        System.out.println("ente the array2 elements");
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.next();
        }
        System.out.println("input1:" + Arrays.toString(arr1));
        System.out.println("input2:" + Arrays.toString(arr2));
        // merging two arrays in new array......
        String[] arr3 = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("output:" + Arrays.toString(arr3));
    }
}
