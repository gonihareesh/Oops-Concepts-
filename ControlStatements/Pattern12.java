public class Pattern12 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = row; i >= 0; i--) {
            for (int k = row - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
