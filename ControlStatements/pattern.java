public class pattern {
    public static void main(String[] args) {
        int row, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        row = s.nextInt();
        for (i = 0; i <= row; i++) {
            for (j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
