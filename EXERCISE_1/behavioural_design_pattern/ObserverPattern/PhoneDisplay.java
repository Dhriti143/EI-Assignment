package ObserverPattern;

// Concrete Observer
public class PhoneDisplay implements WeatherDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone Display: Temperature: " + temperature);
    }
}