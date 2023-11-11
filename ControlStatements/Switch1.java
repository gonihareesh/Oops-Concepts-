import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the valied number:");
        int number = s.nextInt();

        switch (number % 2) {

            case 0:
                System.out.println("this number is even");
                break;
            case 1:
                System.out.println("this number is odd");
                break;

        }

    }

}
