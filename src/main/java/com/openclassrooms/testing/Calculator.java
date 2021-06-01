package com.openclassrooms.testing;

/**
 * A very basic calculator.
 * Handy if you lose your phone.
 */
public class Calculator implements CalculatorInterface {

    private final ConversionCalculator conversionCalculator;


    /**
     * {@inheritDoc}
     */
    public Calculator(ConversionCalculator conversionCalculator) {
        this.conversionCalculator = conversionCalculator;
    }

    /**
     * {@inheritDoc}
     */
    public Double add(final Double left, final Double right) {
        return left + right;
    }

    /**
     * {@inheritDoc}
     */
    public Double subtract(final Double left, final Double right) {
        return left - right;
    }

    /**
     * {@inheritDoc}
     */
    public Double convert(ConversionType type, Double value) throws ConversionException {
        Double result;
        if (type == ConversionType.RADIUS_TO_AREA) {
            result = conversionCalculator.radiusToAreaOfCircle(value);
        } else {
            throw new ConversionException("Unknown ConversionType");
        }
        return result;
    }
}
