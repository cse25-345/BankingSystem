
public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
            "Tsuki", "Lantbell",
            "Gaborone", "74356171", "TsuLantbell@ymail.com",
            "C001", "Tsuki", "Tsu001kiki"
        );

        InvestmentAccount investment = new InvestmentAccount(
            "I001", 1000, "Gaborone Branch", customer
        );

        customer.addAccount(investment);

        Account account = investment;

        System.out.println("Initial balance: BWP" + account.getBalance());

        account.deposit(500);
        account.deposit(200, "Additional deposit");

        System.out.println("After deposits: BWP" + account.getBalance());

        account.withdraw(200);
        System.out.println("After withdrawal: BWP" + account.getBalance());

        InterestBearing interestAccount = investment;
        interestAccount.payInterest();

        System.out.println("After interest: BWP" + account.getBalance());

        System.out.println("Total transactions: " +
                account.getTransactions().size());

        SavingsAccount savings = new SavingsAccount(
            "S001", 2000, "Gaborone Branch", customer
        );

        customer.addAccount(savings);

        System.out.println("\n--- Savings Account Test ---");

        System.out.println("Initial balance: BWP" + savings.getBalance());

        savings.payInterest();

        System.out.println("Balance after interest: BWP" + savings.getBalance());

        savings.withdraw(100);

        System.out.println("Balance after attempted withdrawal: BWP" + savings.getBalance());

        ChequeAccount cheque = new ChequeAccount(
           "C001", 3000, "Gaborone Branch", customer,
           "ABC Company", "Gaborone"
        );

        customer.addAccount(cheque);

        System.out.println("\n--- Cheque Account Test ---");

        System.out.println("Initial balance: BWP" + cheque.getBalance());

        cheque.deposit(500);

        System.out.println("After deposit: BWP" + cheque.getBalance());

        cheque.withdraw(200);

        System.out.println("After withdrawal: BWP" + cheque.getBalance());

        System.out.println("\n--- Employment Details Test ---");

        try {
            ChequeAccount invalidCheque = new ChequeAccount(
                "C002", 3000, "Gaborone Branch", customer,
                "", ""
            );
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
