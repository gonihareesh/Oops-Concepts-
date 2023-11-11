import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks of student:");
        int marks = s.nextInt();
        if (marks < 35) {
            System.out.println("student is fail");

        }
        if (marks == 35) {
            System.out.println("student is a pass");

        }
        if (marks > 35 && marks < 75) {
            System.out.println("student passed in 3rd class ");
        }
        if (marks > 75 && marks < 85) {
            System.out.println("student passed in 2nd class..");
        }
        if (marks > 85) {
            System.out.println("student passed in 1st class..");
        }

    }

}
