package Array;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = null;
        System.out.println("enter the array lenght:");
        int length = s.nextInt();
        arr = new int[length];
        System.out.println("enter the array elements");
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();

        }
        System.out.println("the entered array");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + "\t");
    }

}
