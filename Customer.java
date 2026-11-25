import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private String customerID;
    private String username;
    private String password;

    private List<Account> accounts = new ArrayList<>();

    public Customer(String firstname, String surname,
                    String address, String phone, String email,
                    String customerID, String username, String password) {

        super(firstname, surname, address, phone, email);

        this.customerID = customerID;
        this.username = username;
        this.password = password;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
