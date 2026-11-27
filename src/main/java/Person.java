public abstract class Person {

    protected String firstname;
    protected String surname;
    protected String address;
    protected String phone;
    protected String email;

    public Person(String firstname, String surname,
                  String address, String phone, String email) {

        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }
}
