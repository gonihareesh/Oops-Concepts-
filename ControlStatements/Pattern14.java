public class Pattern14 {
    public static void main(String[] args) {
        char ch = '*';
        for (int i = 0; i <= 5; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(ch + " ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + 65));

                System.out.print(" ");

            }
            System.out.println();
        }
    }

}
