
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
    }
}
