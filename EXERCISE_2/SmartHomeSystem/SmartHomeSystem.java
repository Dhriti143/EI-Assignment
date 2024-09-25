package SmartHomeSystem;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem {
    private List<Device> devices;
    private List<Schedule> schedules;
    private List<Trigger> triggers;

    public SmartHomeSystem() {
        this.devices = new ArrayList<>();
        this.schedules = new ArrayList<>();
        this.triggers = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void executeCommand(String command) {
        String[] parts = command.split("\\(|\\)");
        String action = parts[0];
        int deviceId = Integer.parseInt(parts[1]);

        Device device = findDevice(deviceId);
        if (device != null) {
            switch (action) {
                case "turnOn":
                    device.turnOn();
                    break;
                case "turnOff":
                    device.turnOff();
                    break;
                case "setTemperature":
                    if (device instanceof Thermostat) {
                        ((Thermostat) device).setTemperature(Integer.parseInt(parts[1].split(",")[1].trim()));
                    }
                    break;
                case "lock":
                    if (device instanceof DoorLock) {
                        ((DoorLock) device).lock();
                    }
                    break;
                case "unlock":
                    if (device instanceof DoorLock) {
                        ((DoorLock) device).unlock();
                    }
                    break;
            }
        }
    }

    public void setSchedule(int deviceId, String time, String action) {
        schedules.add(new Schedule(deviceId, time, action));
    }

    public void addTrigger(String condition, String operator, int value, String action) {
        triggers.add(new Trigger(condition, operator, value, action));
    }

    public String getStatusReport() {
        StringBuilder report = new StringBuilder("Status Report:\n");
        for (Device device : devices) {
            report.append(device.getStatus()).append("\n");
        }
        return report.toString();
    }

    public String getScheduledTasks() {
        return "Scheduled Tasks: " + schedules.toString();
    }

    public String getAutomatedTriggers() {
        return "Automated Triggers: " + triggers.toString();
    }

    private Device findDevice(int id) {
        return devices.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }
}