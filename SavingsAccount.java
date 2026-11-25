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

        System.out.println("Interest paid: BWP" + interest);
    }
}
