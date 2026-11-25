public class BankTeller extends Person {

    private String tellerID;
    private String username;
    private String password;

    public BankTeller(String firstname, String surname,
                      String address, String phone, String email,
                      String tellerID, String username, String password) {

        super(firstname, surname, address, phone, email);

        this.tellerID = tellerID;
        this.username = username;
        this.password = password;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public String getTellerID() {
        return tellerID;
    }
}
