package OOps;

public class TestBank
{
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setAccountNumber(62236538);
        b.setCustomerName("harish");
        b.setEmail("harish@gmail.com");
        b.setNumber(964008334);
        b.setAccountBalance(650000);
        b.depositeFunds();
        b.withdrawFunds();
    }
}
