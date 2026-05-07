////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {

    @Test
    void print_returnsAsciiArtForOne() {

        // Arrange
        String expected =
            " _____ \n"
            + "|_   _|\n"
            + "  | |  \n"
            + "  | |  \n"
            + " _| |_ \n"
            + "|_____|\n";

        // Act
        String result = RomanPrinter.print(1);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void print_returnsAsciiArtForTwo() {

        // Arrange
        String expected =
            " _____   _____ \n"
            + "|_   _| |_   _|\n"
            + "  | |     | |  \n"
            + "  | |     | |  \n"
            + " _| |_   _| |_ \n"
            + "|_____| |_____|\n";

        // Act
        String result = RomanPrinter.print(2);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void print_returnsAsciiArtForThree() {

        // Arrange
        String expected =
            " _____   _____   _____ \n"
            + "|_   _| |_   _| |_   _|\n"
            + "  | |     | |     | |  \n"
            + "  | |     | |     | |  \n"
            + " _| |_   _| |_   _| |_ \n"
            + "|_____| |_____| |_____|\n";

        // Act
        String result = RomanPrinter.print(3);

        // Assert
        assertEquals(expected, result);
    }
}