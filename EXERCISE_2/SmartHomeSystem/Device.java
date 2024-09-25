package SmartHomeSystem;

public abstract class Device {
    protected int id;
    protected boolean isOn;

    public Device(int id) {
        this.id = id;
        this.isOn = false;
    }

    public int getId() {
        return id;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public abstract String getStatus();
}