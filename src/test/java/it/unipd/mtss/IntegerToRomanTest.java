////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @ParameterizedTest
    @CsvSource({
        "1, I", "2, II", "3, III", "4, IV", "5, V", "6, VI",
        "7, VII", "8, VIII", "9, IX", "10, X"
    })
    void convert_returnsCorrectRomanNumeral(int input, String expected) {
        // Arrange - input e expected dal @CsvSource

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }
}