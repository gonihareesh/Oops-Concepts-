package Array;

public class Array3 {
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 4; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                System.out.println(min);

            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 22, 3, 4, 5, 6 };
        min(a);
    }

}
