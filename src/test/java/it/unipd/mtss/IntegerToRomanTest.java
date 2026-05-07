////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
    })
    void convert_returnsCorrectRomanNumber(
            final int input,
            final String expected) {

        // Arrange
        int number = input;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals(expected, result);
    }
}