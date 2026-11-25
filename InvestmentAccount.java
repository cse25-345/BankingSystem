public class InvestmentAccount extends Account implements InterestBearing {

    public InvestmentAccount(String accountNumber, double initialDeposit,
                             String branch, Customer customer) {

        super(accountNumber, 0, branch, customer);

        if (initialDeposit < 500) {
            throw new IllegalArgumentException(
                "Investment account requires at least BWP500."
            );
        }

        balance = initialDeposit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            transactions.add(new Transaction(
                java.util.UUID.randomUUID().toString(),
                "WITHDRAWAL", amount, "Money withdrawn"
            ));

            System.out.println("Withdrawal successful.");

        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }

    @Override
    public void payInterest() {

        double interest = calculateInterest();
        balance += interest;

        System.out.println("Interest paid: BWP" + interest);
    }
}
