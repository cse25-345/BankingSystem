import java.time.LocalDate;

public class Transaction {

    private String transactionID;
    private LocalDate date;
    private String type;
    private double amount;
    private String status;
    private String description;

    public Transaction(String transactionID, String type,
                       double amount, String description) {

        this.transactionID = transactionID;
        this.date = LocalDate.now();
        this.type = type;
        this.amount = amount;
        this.status = "SETTLED";
        this.description = description;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
