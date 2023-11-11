import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int day;
            System.out.println("enter the value");
            day = s.nextInt();
            if (day == 1) {
                System.out.println("it is a monday");

            } else if (day == 2) {
                System.out.println("todya is tuesday");
            } else if (day == 3) {
                System.out.println("todya is a wednesday");
            } else if (day == 4) {
                System.out.println("today is a thursday");
            } else if (day == 5) {
                System.out.println("today is a friday");
            } else if (day == 6) {
                System.out.println("today is a saturday");
            } else if (day == 7) {
                System.out.println("today is a sunday");
            } else {
                System.out.println("invalide day range");
            }
        }

    }
}