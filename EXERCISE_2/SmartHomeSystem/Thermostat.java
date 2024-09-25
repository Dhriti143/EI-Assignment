package SmartHomeSystem;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(int id) {
        super(id);
        this.temperature = 70; // Default temperature
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }
}