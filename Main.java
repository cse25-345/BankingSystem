
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

        System.out.println("Initial balance: BWP" + investment.getBalance());

        investment.deposit(500);
        System.out.println("After deposit: BWP" + investment.getBalance());

        investment.withdraw(200);
        System.out.println("After withdrawal: BWP" + investment.getBalance());

        investment.payInterest();
        System.out.println("After interest: BWP" + investment.getBalance());

        System.out.println("Total transactions: " +
                investment.getTransactions().size());
    }
}
