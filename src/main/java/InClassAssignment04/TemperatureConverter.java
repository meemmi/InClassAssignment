package InClassAssignment04;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public boolean isExtremeTemperature(double temperature) {
        if (temperature < -40 || temperature > 50) {
            return true;
        } else {
            return false;
        }
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;

    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = 100;
        converter.fahrenheitToCelsius(fahrenheit);

        double kelvin = 300;
        converter.kelvinToCelsius(kelvin);

        converter.isExtremeTemperature(-50);


    }

}