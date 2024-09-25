package ObserverPattern;

// Subject interface
public interface WeatherStation {
    void registerDisplay(WeatherDisplay display);

    void removeDisplay(WeatherDisplay display);

    void notifyDisplays();
}
