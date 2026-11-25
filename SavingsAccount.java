public class SavingsAccount extends Account implements InterestBearing {

    public SavingsAccount(String accountNumber, double balance,
                          String branch, Customer customer) {

        super(accountNumber, balance, branch, customer);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed on Savings Accounts.");
    }

    @Override
    public double calculateInterest() {
        return balance * 0.0005;
    }

    @Override
    public void payInterest() {

       double interest = calculateInterest();
       balance += interest;

       transactions.add(new Transaction(
            java.util.UUID.randomUUID().toString(),
            "INTEREST",
            interest,
            "Monthly interest paid"
        ));

       System.out.println("Interest paid: BWP" + interest);
    }
}
