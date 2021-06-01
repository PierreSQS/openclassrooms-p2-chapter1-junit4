package com.openclassrooms.testing;

/**
 * Converts between different types of units.
 */
public class ConversionCalculator implements ConversionCalculatorInteface {

    // constants for temperature conversion
    private static final double BASE_FAHRENHEIT = 32.0;
    private static final double CELSIUS_FAHRENHEIT_CONVERSION_FACTOR = 9.0 / 5.0;

    // constants for litre to gallons
    private static final double LITRE_TO_GALLON_MULTIPLIER = 0.264172;

    // constant to raise radius by when calculating a circle
    private static final double POWER_OF_RADIUS = 2.0;

    // constant to raise meters to kilometers
    private static final double M_TO_KM_MULTIPLIER = 1000.0;

    /**
     * Converts centigrade to fahrenheit.
     * @param celsiusTemperature to convert
     * @return fahrenheit temperature.
     */
    @Override
    public Double celsiusToFahrenheit(Double celsiusTemperature) {
        return (celsiusTemperature * CELSIUS_FAHRENHEIT_CONVERSION_FACTOR) + BASE_FAHRENHEIT;
    }

    /**
     * Converts fahrenheit to centigrade
     * @param fahrenheitTemperature to convert
     * @return CelsiusTemperature
     */
    @Override
    public Double fahrenheitToCelsius(Double fahrenheitTemperature) {
        return (fahrenheitTemperature - BASE_FAHRENHEIT) * CELSIUS_FAHRENHEIT_CONVERSION_FACTOR;
    }

    /**
     * Converts a volume in litres to gallons.
     * @param litreVolume to convert
     * @return volume in gallons
     */
    @Override
    public Double litresToGallons(Double litreVolume) {
        return Math.ceil(litreVolume * LITRE_TO_GALLON_MULTIPLIER);
    }

    /**
     * Converts a radius to the area of a circle
     * @param radius of the circle
     * @return area of the circle in the same unit
     */
    @Override
    public Double radiusToAreaOfCircle(Double radius) {
        return Math.PI * Math.pow(radius, POWER_OF_RADIUS);

    }

    @Override
    public Double metersToKilomers(Double meters) {
        return meters / M_TO_KM_MULTIPLIER;
    }

}
