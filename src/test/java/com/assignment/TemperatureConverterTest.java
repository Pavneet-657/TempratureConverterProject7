package com.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        double result = converter.celsiusToFahrenheit(0);

        assertEquals(32.0, result, 0.001);
    }
}

