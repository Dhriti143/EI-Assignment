package SmartHomeSystem;

public class Schedule {
    private int deviceId;
    private String time;
    private String action;

    public Schedule(int deviceId, String time, String action) {
        this.deviceId = deviceId;
        this.time = time;
        this.action = action;
    }

    @Override
    public String toString() {
        return "{device: " + deviceId + ", time: \"" + time + "\", command: \"" + action + "\"}";
    }
}