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
        "7, VII", "8, VIII", "9, IX", "10, X", "11, XI", "12, XII",
        "13, XIII", "14, XIV", "15, XV", "16, XVI", "17, XVII", "18, XVIII",
        "19, XIX", "20, XX", "21, XXI", "22, XXII", "23, XXIII", "24, XXIV",
        "25, XXV", "26, XXVI", "27, XXVII", "28, XXVIII", "29, XXIX", "30, XXX",
        "40, XL", "41, XLI", "42, XLII", "43, XLIII", "44, XLIV", "45, XLV",
        "49, XLIX", "50, L"
    })
    void convert_returnsCorrectRomanNumeral(int input, String expected) {
        // Arrange - input e expected dal @CsvSource

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals(expected, result);
    }
}