package dipdemo;

// High-level module depends on abstraction
public class Notification {
    private final MessageService messageService;

    // Constructor injection
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}
