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
        double celsiusF = converter.fahrenheitToCelsius(fahrenheit);
        System.out.printf("100 Fahrenheit -> celcius %.2f%n", celsiusF);

        double kelvin = 300;
        double celciusK = converter.kelvinToCelsius(kelvin);
        System.out.printf("300 Kelvin -> celcius: %.2f%n", celciusK);

        boolean extremeTemp = converter.isExtremeTemperature(-50);
        System.out.println("Extreme temperature: " + extremeTemp);


    }

}