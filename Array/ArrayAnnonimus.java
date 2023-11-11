package Array;

public class ArrayAnnonimus {
    static void printMin(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        printMin(new int[] { 22, 3, 4, 55 });
    }

}
