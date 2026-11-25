public class ChequeAccount extends Account {

    private String companyName;
    private String companyAddress;

    public ChequeAccount(String accountNumber, double balance,
                         String branch, Customer customer,
                         String companyName, String companyAddress) {

        super(accountNumber, balance, branch, customer);

        this.companyName = companyName;
        this.companyAddress = companyAddress;

        if (companyName == null || companyName.trim().isEmpty()
                || companyAddress == null || companyAddress.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Employment details are required."
            );
        }
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
}
