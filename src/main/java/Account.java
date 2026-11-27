
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Account {

    protected String accountNumber;
    protected double balance;
    protected String branch;
    protected Customer customer;

    protected List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber, double balance,
                   String branch, Customer customer) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
        this.customer = customer;
    }

    public void deposit(double amount) {
        deposit(amount, "Money deposited");
    }

    public void deposit(double amount, String description) {

        if (amount > 0) {
            balance += amount;

            transactions.add(new Transaction(
                UUID.randomUUID().toString(),
                "DEPOSIT",
                amount,
                description
            ));

            System.out.println("Deposit successful.");

        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
