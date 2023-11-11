public class Pattern11 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i == 1)
                System.out.print("");
            else
                System.out.println("* ");

        }
        for (i = 4; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print("");
            }
            System.out.print("*");
            for (j = 1; j < (i - 1) * 2; j++) {
                System.out.print("");
            }
            if (i == 1)
                System.out.println("");
            else
                System.out.println("*");
        }
    }

}
