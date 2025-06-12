package dipdemo;

public class Main {
    public static void main(String[] args) {
        // Inject EmailService
        MessageService emailService = new EmailService();
        Notification emailNotification = new Notification(emailService);
        emailNotification.notifyUser("Check your email inbox!");

        // Inject SMSService
        MessageService smsService = new SMSService();
        Notification smsNotification = new Notification(smsService);
        smsNotification.notifyUser("Check your phone messages!");
    }
}
