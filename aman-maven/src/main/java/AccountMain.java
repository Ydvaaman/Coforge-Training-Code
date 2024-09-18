public class AccountMain {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount();
        account1.setAccountId(1001);
        account1.setName("aman kumar");
        account1.setTime(12);
        account1.setRate(0.05f);

        account1.accountInformation();
        System.out.println("Inteerest amount is "+account1.interestCalculation());
    }
}
