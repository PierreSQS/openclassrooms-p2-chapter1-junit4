package com.openclassrooms.testing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Part 2 - Chapter 1
 * Here are some nice reminders of how you can use the standard annotations we covered.
 *
 * @author Raf Gemmail
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    ConversionCalculator conversionCalculatorTestDouble;

    Calculator calculatorUnderTest;

    @Before
    public void setUp() {
        calculatorUnderTest = new Calculator(conversionCalculatorTestDouble);
    }

    // Checkout this site to see other popular naming conventions
    // https://dzone.com/articles/7-popular-unit-test-naming
    @Test
    public void add_returnsTheSum_OfTwoPositiveNumbers() {
        Double expected = 3.0;
        Double sum = calculatorUnderTest.add(1.0, 2.0);
        assertThat(sum, is(equalTo(expected)));
    }

    @Test
    public void add_returnsTheSum_OfTwoNegativeNumbers() {
        Double expected = -3.0;
        Double sum = calculatorUnderTest.add(-1.0, -2.0);
        assertThat(sum, is(equalTo(expected)));
    }

    @Test
    public void subtract_returnsTheDifference_BetweenTwoNumbers() {
        Double expected = -2.0;
        Double difference = calculatorUnderTest.subtract(3.0, 5.0);
        assertThat(difference, is(equalTo(expected)));
    }

    @Test
    public void convert_callsTheConverter_WhenRequestingRadiusToArea() throws Exception {
        Double radius = 1.0;
        when(conversionCalculatorTestDouble.radiusToAreaOfCircle(radius)).thenReturn(Math.PI);
        calculatorUnderTest.convert(ConversionType.RADIUS_TO_AREA, radius);
        // check we called it
        verify(conversionCalculatorTestDouble).radiusToAreaOfCircle(radius);
    }
}
