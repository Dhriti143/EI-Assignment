package ObserverPattern;

// Observer interface
public interface WeatherDisplay {
    void update(float temperature, float humidity, float pressure);
}