# Weather Station Observer Pattern Example

This project demonstrates the implementation of the Observer design pattern using a weather station scenario. The Observer pattern is used to define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Project Structure

The project consists of the following components:

1. `WeatherDisplay` (Observer) interface
2. `PhoneDisplay` (Concrete Observer) class
3. `WeatherStation` (Subject) interface
4. `WeatherData` (Concrete Subject) class
5. `Main` class for demonstration


## How It Works

1. The `WeatherData` class maintains a list of observers (`WeatherDisplay` objects).
2. Observers can register and unregister from the `WeatherData` subject.
3. When the weather measurements change, `WeatherData` notifies all registered observers.
4. Each observer (`PhoneDisplay` in this example) updates its display with the new data.

## Usage

To use this weather station system:

1. Create an instance of `WeatherData`.
2. Create instances of display classes that implement `WeatherDisplay`.
3. Register the displays with the `WeatherData` instance.
4. Update the weather measurements using the `setMeasurements` method.

Example:

```java
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        
        weatherData.registerDisplay(phoneDisplay);
        
        weatherData.setMeasurements(25.0f, 65.0f, 1013.0f);
        weatherData.setMeasurements(30.0f, 70.0f, 1010.0f);
        
        weatherData.removeDisplay(phoneDisplay);
    }
}
```