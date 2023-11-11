package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int le;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array lenth");
        le = s.nextInt();
        int a[] = new int[le];
        System.out.println("element" + le + "store into array");
        for (int i = 0; i < le; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("elements in array");
        System.out.println("input:" + Arrays.toString(a));
        int sum = 0;
        for (int i = 0; i < le; i++) {
            sum *= a[i];

        }
        System.out.print("output: " + sum);
    }
}
