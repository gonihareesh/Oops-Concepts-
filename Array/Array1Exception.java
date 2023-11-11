package Array;

public class Array1Exception {
    public static void main(String[] args) {
        // array indexoutof bound
        int[] arr = { 20, 78, 98, 56 };
        for (int i = 1; i <= arr.length; i++)
            System.out.println(arr[i]);
    }

}
