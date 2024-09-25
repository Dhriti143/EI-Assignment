package SmartHomeSystem;

public class Light extends Device {
    public Light(int id) {
        super(id);
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }
}