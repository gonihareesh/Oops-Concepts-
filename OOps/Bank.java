package OOps;

import java.util.Scanner;

public class Bank
{
    private long accountNumber;
    private String customerName;
    private int accountBalance;
    private String email;
    private int number;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long  accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void depositeFunds(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount which you want to deposite");
        int deposite=s.nextInt();
        int totalAmount =accountBalance+deposite;
        System.out.println("total amount is "+totalAmount);
    }
    public void withdrawFunds(){
        Scanner s=new Scanner(System.in);
    System.out.println("enter the amount which you want to withdraw");
        int amount=s.nextInt();

        if(accountBalance<0){
            System.out.println("InSuffence balance ");
        }else {
            int totalAmount =accountBalance-amount;
            System.out.println("Your remaining balance is "+totalAmount);
        }
    }
}
