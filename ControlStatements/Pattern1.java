public class Pattern1 {
    public static void main(String args[]) {
        int i = 1;
        char ch = '*';
        for (i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print(ch + "");
                System.out.print(i);
            }
            System.out.println();
        }
    }
}