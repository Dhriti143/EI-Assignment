package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        // Get the DatabaseConnectionManager instance
        DatabaseConnectionManager manager1 = DatabaseConnectionManager.getInstance();
        manager1.connect();

        // Try to get another instance
        DatabaseConnectionManager manager2 = DatabaseConnectionManager.getInstance();

        // Check if both references point to the same object
        if (manager1 == manager2) {
            System.out.println("Both variables are referencing the same DatabaseConnectionManager instance.");
        } else {
            System.out.println("Different instances. This should not happen!");
        }
    }
}