import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import testingtempretureconverter.TemperatureConverter;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01, "0°C should be 32°F");
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.01, "100°C should be 212°F");
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37), 0.01, "37°C should be 98.6°F");
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.01, "-40°C should be -40°F");
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01, "32°F should be 0°C");
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.01, "212°F should be 100°C");
        assertEquals(37.0, TemperatureConverter.fahrenheitToCelsius(98.6), 0.01, "98.6°F should be 37°C");
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.01, "-40°F should be -40°C");
    }
}
