import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @Before
    public void setUp() {
        converter = new TemperatureConverter();  // Assuming a constructor exists.
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Testing conversion of 32°F (freezing point) -> 0°C
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);

        // Testing conversion of 212°F (boiling point) -> 100°C
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);

        // Testing edge case: absolute zero (-459.67°F) -> -273.15°C
        assertEquals(-273.15, converter.fahrenheitToCelsius(-459.67), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        // Testing conversion of 0°C (freezing point) -> 32°F
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);

        // Testing conversion of 100°C (boiling point) -> 212°F
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);

        // Testing edge case: absolute zero (-273.15°C) -> -459.67°F
        assertEquals(-459.67, converter.celsiusToFahrenheit(-273.15), 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        // Assuming this method returns true for temperatures > 100°C or < 0°C
        assertTrue(converter.isExtremeTemperature(-10));  // Below 0°C
        assertTrue(converter.isExtremeTemperature(120));  // Above 100°C
        assertFalse(converter.isExtremeTemperature(50));  // Normal temperature
    }
}
