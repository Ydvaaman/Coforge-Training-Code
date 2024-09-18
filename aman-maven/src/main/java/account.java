public class account {
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;

    public account(int accountNumber, double balance, Customer customerObj) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerObj = customerObj;
    }


}
