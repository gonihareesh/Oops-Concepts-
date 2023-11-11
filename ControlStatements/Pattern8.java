import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        int i, j, row;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        row = s.nextInt();
        System.out.println("printing pattern....");
        for (i = 1; i <= row; i++) {
            for (j = row; j > i; j--) {
                System.out.print(" ");
            }
            // int temp=1;
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
