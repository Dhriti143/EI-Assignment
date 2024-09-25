package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        try {
            // Create an email notification
            Notification emailNotification = factory.createNotification("EMAIL");
            emailNotification.notifyUser();

            // Try to create an invalid notification type
            Notification smsNotification = factory.createNotification("SMS");
            smsNotification.notifyUser();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}