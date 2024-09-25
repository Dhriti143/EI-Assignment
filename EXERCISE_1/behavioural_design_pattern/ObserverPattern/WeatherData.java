package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class WeatherData implements WeatherStation {
    private List<WeatherDisplay> displays = new ArrayList<>();
    private float temperature, humidity, pressure;

    public void registerDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    public void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyDisplays();
    }
}
