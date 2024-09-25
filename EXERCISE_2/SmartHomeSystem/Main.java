package SmartHomeSystem;

public class Main {
    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();

        // Initialize devices
        system.addDevice(new Light(1));
        system.addDevice(new Thermostat(2));
        system.addDevice(new DoorLock(3));

        // Demonstrate functionality
        system.executeCommand("turnOn(1)");
        system.executeCommand("setTemperature(2, 70)");
        system.executeCommand("lock(3)");

        system.setSchedule(2, "06:00", "turnOn");
        system.addTrigger("temperature", ">", 75, "turnOff(1)");

        // Print status
        System.out.println(system.getStatusReport());
        System.out.println(system.getScheduledTasks());
        System.out.println(system.getAutomatedTriggers());
    }
}
