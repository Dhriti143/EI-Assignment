package FactoryPattern;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equals("EMAIL")) {
            return new EmailNotification();
        } else {
            throw new IllegalArgumentException("Unknown type");
        }
    }
}
