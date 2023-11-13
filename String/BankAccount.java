package OOps;

public abstract class BankAccount
{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance()+amount);
        System.out.println("deposit of "+amount+" is successfull.");
        System.out.println("current balance "+getAccountNumber()+" is "+getBalance());
    }

    @Override
    public void withdraw(double amount) {
if(getBalance()>=amount){
    setBalance(getBalance()-amount);
    System.out.println("withdraw of "+amount+" is successful");
    System.out.println("current balance "+getAccountNumber()+" is "+getBalance());
}else{
    System.out.println("Insufficient funds. Withdrawal failed");
}
    }
}
class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance()+amount);
        System.out.println("deposit of "+amount+"successfull.");
        System.out.println("current balance "+getAccountNumber()+" is "+getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()>=amount){
            setBalance(getBalance()-amount);
            System.out.println("withdraw of "+amount+" is successful");
            System.out.println("current balance "+getAccountNumber()+" is "+getBalance());
        }else{
            System.out.println("Insufficient funds. Withdrawal failed");
        }
    }

}
class TestBankBalance {
    public static void main(String[] args) {
        SavingAccount sa=new SavingAccount("625897845",2000);
        sa.deposit(4000);

    }
}