package InClassAssignment04;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    InClassAssignment04.TemperatureConverter converter = new TemperatureConverter();

    @Test
       void fahrenheitToCelsius() {
        assertEquals(10, converter.fahrenheitToCelsius(50), 0.01);
        assertEquals(-12.22, converter.fahrenheitToCelsius(10), 0.01);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
        assertEquals(122, converter.celsiusToFahrenheit(50), 0.01);
    }

    @Test
    void isExtremeTemperature() {
        assertEquals(true, converter.isExtremeTemperature(-44));
        assertEquals(true, converter.isExtremeTemperature(55));
        assertEquals(false, converter.isExtremeTemperature(10));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(0, converter.kelvinToCelsius(273.15), 0.01);
        assertEquals(100, converter.kelvinToCelsius(373.15), 0.01);
    }
}