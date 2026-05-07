////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(final int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(final String romanNumber) {

        switch (romanNumber) {

            case "I":
                return " _____ \n"
                        + "|_   _|\n"
                        + "  | |  \n"
                        + "  | |  \n"
                        + " _| |_ \n"
                        + "|_____|\n";

            case "II":
                return " _____   _____ \n"
                        + "|_   _| |_   _|\n"
                        + "  | |     | |  \n"
                        + "  | |     | |  \n"
                        + " _| |_   _| |_ \n"
                        + "|_____| |_____|\n";

            case "III":
                return " _____   _____   _____ \n"
                        + "|_   _| |_   _| |_   _|\n"
                        + "  | |     | |     | |  \n"
                        + "  | |     | |     | |  \n"
                        + " _| |_   _| |_   _| |_ \n"
                        + "|_____| |_____| |_____|\n";

            default:
                return romanNumber;
        }
    }
}
