import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the 1st value:");
        int n = s.nextInt();
        System.out.println("enter 2nd value:");
        int m = s.nextInt();
        System.out.println("enter the target +,-,*,/:");

        int target = s.next().charAt(0);
        switch (target) {
            case '+':
                int result = n + m;
                System.out.println(result);
                break;
            case '-':
                result = n - m;
                System.out.println(result);
                break;
            case '*':
                result = n * m;
                System.out.println(result);
                break;
            case '/':
                result = n / m;
                System.out.println(result);
                break;

        }
    }
}
