////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {
            5, 4, 1
    };

    private static final String[] SYMBOLS = {
            "V", "IV", "I"
    };

    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException(
                    "Number must be between 1 and 6, got: " + number);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                number -= VALUES[i];
            }
        }
        return result.toString();
    }
}
