package Array;

public class JaggedArray {
    public static void main(String[] args) {
        // declaring a 2D array in odd column
        int a[][] = new int[3][4];
        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[2];
        // a[3]=new int[1];
        // initialinzing a jagged array
        int count = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; i < a[i].length; j++)
                a[i][j] = count++;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; i < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }

}
