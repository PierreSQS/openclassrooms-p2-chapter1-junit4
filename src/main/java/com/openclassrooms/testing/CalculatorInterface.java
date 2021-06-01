package com.openclassrooms.testing;

public interface CalculatorInterface {

    /**
     * Adds the left argument to the right.
     *
     * @param left  The first number to be added
     * @param right A number to be added to the left argument
     * @return result of the addition
     */
    Double add(final Double left, final Double right);

    /**
     * Subtracts one number from another.
     *
     * @param left  The first number to be added
     * @param right A number to be added to the left argument
     * @return result of the subtraction
     */
    Double subtract(final Double left, final Double right);

    /**
     * Converts a value based on the requested ConversionType.
     * @param type to convert to.
     * @param value to be converted.
     * @return converted value.
     */
    Double convert(ConversionType type, Double value) throws ConversionException;
}
