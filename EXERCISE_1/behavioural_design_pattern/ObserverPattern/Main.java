package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        // Create a WeatherData instance (the subject)
        WeatherData weatherData = new WeatherData();

        // Create a PhoneDisplay instance (the observer)
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        // Register the PhoneDisplay with the WeatherData
        weatherData.registerDisplay(phoneDisplay);

        // Simulate weather measurements
        weatherData.setMeasurements(25.0f, 65.0f, 1013.0f); // First measurement
        weatherData.setMeasurements(30.0f, 70.0f, 1010.0f); // Second measurement
        weatherData.setMeasurements(28.0f, 75.0f, 1008.0f); // Third measurement

        // Unregister the display
        weatherData.removeDisplay(phoneDisplay);
    }
}
