public class NotificationService {

    public void sendNotification(Customer customer, String message) {

        System.out.println("Notification for "
                + customer.getFirstname() + " "
                + customer.getSurname());

        System.out.println(message);
    }

    public void sendDepositNotification(Customer customer, double amount) {

        sendNotification(customer,
                "Your deposit of BWP" + amount + " was successful.");
    }

    public void sendInterestNotification(Customer customer, double amount) {

        sendNotification(customer,
                "Interest of BWP" + amount + " has been added to your account.");
    }
}
