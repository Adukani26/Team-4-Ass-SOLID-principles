package dip_compliance;

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Notification notification = new Notification(emailService);
        notification.notifyUser("Compliance with DIP example");
    }
}
